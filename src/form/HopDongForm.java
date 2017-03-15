package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import model.bean.KhachHang;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
public class HopDongForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String maHopDong;
	private String maKhachHang;
	private String tenKhachHang;
	private int gioiTinh;
	private int soCMND;
	private String diaChi;
	private String themHopDong;
	private ArrayList<KhachHang> listHopDong;
	
	public String getThemHopDong() {
		return themHopDong;
	}
	public void setThemHopDong(String themHopDong) {
		this.themHopDong = themHopDong;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getSoCMND() {
		return soCMND;
	}
	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public ArrayList<KhachHang> getListHopDong() {
		return listHopDong;
	}
	public void setListHopDong(ArrayList<KhachHang> listHopDong) {
		this.listHopDong = listHopDong;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.reset(mapping, request);
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
