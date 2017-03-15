package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import model.bean.ChiTietHopDong;
import model.bean.DanhMucTaiSan;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ChiTietHopDongForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//input 
	//CTHD
	private ArrayList<ChiTietHopDong> listChiTietHopDong;
	private int MaCTHD;
	private String moTaTaiSan;
	private String urlHinhAnh;
	private float soTienCam;
	private String ngayCam;
	private String ngayTra;
	
	//HopDong
	private int maHopDong;
	
	// Tài sản
	private String tenTaiSan;
	
	// Danh Muc
	private int maDanhMuc;
	private String tenDanhMuc;
	private ArrayList<DanhMucTaiSan> listDanhMuc=new ArrayList<DanhMucTaiSan>();
	
	//Khach Hang
	private String maKhachHang;
	private String tenKhachHang;
	private String diaChi;
	
	//Lãi suất
	private int maLaiSuat;
	private float mucLaiSuat;

	//event
	private String datHopDong;
	private String tinhLaiSuat;
	
	
	//-- CTHD
	public ArrayList<ChiTietHopDong> getListChiTietHopDong() {
		return listChiTietHopDong;
	}
	public void setListChiTietHopDong(ArrayList<ChiTietHopDong> listChiTietHopDong) {
		this.listChiTietHopDong = listChiTietHopDong;
	}
	
	public int getMaCTHD() {
		return MaCTHD;
	}
	public void setMaCTHD(int maCTHD) {
		MaCTHD = maCTHD;
	}
	public String getUrlHinhAnh() {
		return urlHinhAnh;
	}
	public void setUrlHinhAnh(String urlHinhAnh) {
		this.urlHinhAnh = urlHinhAnh;
	}
	public float getSoTienCam() {
		return soTienCam;
	}
	public void setSoTienCam(float giaCam) {
		this.soTienCam = giaCam;
	}
	public String getNgayCam() {
		return ngayCam;
	}
	public void setNgayCam(String ngayCam) {
		this.ngayCam = ngayCam;
	}
	
	public String getNgayTra() {
		return ngayTra;
	}
	public void setNgayTra(String ngayTra) {
		this.ngayTra = ngayTra;
	}
	
	//-- Hợp Đồng
	public int getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(int maHopDong) {
		this.maHopDong = maHopDong;
	}
	
	//-- Tài sản
	public String getTenTaiSan() {
		return tenTaiSan;
	}
	public void setTenTaiSan(String tenTaiSan) {
		this.tenTaiSan = tenTaiSan;
	}
	public void setMoTaTaiSan(String moTaTaiSan) {
		this.moTaTaiSan = moTaTaiSan;
	}
	public String getMoTaTaiSan() {
		return moTaTaiSan;
	}
	
	//--Danh Mục
	public int getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public ArrayList<DanhMucTaiSan> getListDanhMuc() {
		return listDanhMuc;
	}
	public void setListDanhMuc(ArrayList<DanhMucTaiSan> listDanhMuc) {
		this.listDanhMuc = listDanhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	
	//-- Khách Hàng
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	
	//-- Lãi suất
	public int getMaLaiSuat() {
		return maLaiSuat;
	}
	public void setMaLaiSuat(int maLaiSuat) {
		this.maLaiSuat = maLaiSuat;
	}
	public float getMucLaiSuat() {
		return mucLaiSuat;
	}
	public void setMucLaiSuat(float mucLaiSuat) {
		this.mucLaiSuat = mucLaiSuat;
	}
	
	//-- Event
	public String getDatHopDong() {
		return datHopDong;
	}
	public void setDatHopDong(String datHopDong) {
		this.datHopDong = datHopDong;
	}
	public String getTinhLaiSuat() {
		return tinhLaiSuat;
	}
	public void setTinhLaiSuat(String tinhLaiSuat) {
		this.tinhLaiSuat = tinhLaiSuat;
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
