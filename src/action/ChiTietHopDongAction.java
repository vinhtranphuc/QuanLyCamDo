package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.ChiTietHopDong;
import model.bean.DanhMucTaiSan;
import model.bo.ChiTietHopDongBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.ChiTietHopDongForm;

public class ChiTietHopDongAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ChiTietHopDongBO cthdBO=new ChiTietHopDongBO();
		ChiTietHopDongForm chiTietHopDongForm=(ChiTietHopDongForm) form;
		
		/**
		 * Gọi session
		 */
		HttpSession session=request.getSession();
		Integer maHopDong=chiTietHopDongForm.getMaHopDong();
		
		//kiểm tra maHopDong có tồn tại!?
		if(maHopDong==0)
			maHopDong=Integer.parseInt((String) session.getAttribute("maHopDong"));
		session.setAttribute("maHopDong",String.valueOf(maHopDong));
		
		//test maHopDong
		System.out.println("maHopDong:"+maHopDong);
		
		/**
		 * check event
		 */
		// event datHopDong
		String datHopDong=chiTietHopDongForm.getDatHopDong();
		//test datHopDong
		System.out.println("ChiTietHopDongAction: "+datHopDong);
		if("Đặt Hợp Đồng".equals(datHopDong))
		{
			// lấy input từ browser
			int maDanhMuc=chiTietHopDongForm.getMaDanhMuc();
			String tenTaiSan=chiTietHopDongForm.getTenTaiSan();
			String moTaTaiSan=chiTietHopDongForm.getMoTaTaiSan();
			float giaCam=chiTietHopDongForm.getSoTienCam();
			String hopDongDen=chiTietHopDongForm.getNgayTra();
			
			System.out.println("test thông tin - ChiTietHopDongAction:");
			System.out.println("maDanhMuc: "+maDanhMuc);
			System.out.println("tenTaiSan: "+tenTaiSan);
			System.out.println("moTaTaiSan: "+moTaTaiSan);
			System.out.println("giaCam: "+giaCam);
			System.out.println("hopDongDen: "+hopDongDen);
			
			cthdBO.themTaiSan(maDanhMuc,tenTaiSan,moTaTaiSan);
		}
		
		/**
		 * Lấy dữ liệu từ server
		 */
		//lấy danh sách danh mục 
		ArrayList<DanhMucTaiSan> listDanhMuc=new ArrayList<DanhMucTaiSan>();
		listDanhMuc=cthdBO.getListDanhMuc();
		
		// lấy danh sách chi tiết hợp đồng
		ArrayList<ChiTietHopDong> listChiTietHopDong=new ArrayList<ChiTietHopDong>();
		listChiTietHopDong=cthdBO.getListChiTietHopDong(maHopDong);
		
		/**
		 * Gửi tới client
		 */
		// gửi list danh mục
		chiTietHopDongForm.setListDanhMuc(listDanhMuc);
		//gửi list cthd
		chiTietHopDongForm.setListChiTietHopDong(listChiTietHopDong);
		
		//chuyển sang themChiTietHopDong.jsp
		return mapping.findForward("dschitiethopdong");
	}
}
