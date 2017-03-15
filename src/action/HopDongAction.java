package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.KhachHang;
import model.bo.HopDongBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.HopDongForm;

public class HopDongAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		HopDongBO hopDongBO=new HopDongBO();
		HopDongForm hopDongForm=(HopDongForm) form;
		
		// nếu click nút thêm
		String them=hopDongForm.getThemHopDong();
		//event them
		System.out.println("HopDongAction - event them:"+them);
		if("Them".equals(them))
		{
		// lấy thông tin khách hàng từ brower
		String tenKhachHang=hopDongForm.getTenKhachHang();
		int gioiTinh=hopDongForm.getGioiTinh();
		int soCMND=hopDongForm.getSoCMND();
		String diaChi=hopDongForm.getDiaChi();
		
		// insert vào database
		hopDongBO.themHopDong(tenKhachHang,gioiTinh,soCMND,diaChi);
		}
		
		//lấy danh sách hợp đồng
		ArrayList<KhachHang> listHopDong=new ArrayList<KhachHang>();
		listHopDong=hopDongBO.getListHopDong();
		
		//test danh sach hop dong
		for(KhachHang element:listHopDong)
		{
			System.out.println(element.getMaKhachHang());
			System.out.println(element.getMaHopDong());
			System.out.println(element.getGioiTinh());
			System.out.println(element.getSoCMND());
			System.out.println(element.getDiaChi());
		}
		
		//gửi danh sách hợp đồng	
		hopDongForm.setListHopDong(listHopDong);
		// next page
		return mapping.findForward("dshopdong");
	}
}
