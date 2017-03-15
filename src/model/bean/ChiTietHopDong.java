package model.bean;

public class ChiTietHopDong {
	
	private int maCTHD;
	private int maHopDong;
	private int maLaiSuat;
	private int maDongLai;
	private int maTaiSan;
	private String ngayCam;
	private String ngayTra;
	private float soTienCam;
	private int tinhTrang;
	
	public int getMaCTHD() {
		return maCTHD;
	}
	public void setMaCTHD(int maCTHD) {
		this.maCTHD = maCTHD;
	}
	public int getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(int maHopDong) {
		this.maHopDong = maHopDong;
	}
	public int getMaLaiSuat() {
		return maLaiSuat;
	}
	public void setMaLaiSuat(int maLaiSuat) {
		this.maLaiSuat = maLaiSuat;
	}
	public int getMaDongLai() {
		return maDongLai;
	}
	public void setMaDongLai(int maDongLai) {
		this.maDongLai = maDongLai;
	}
	public int getMaTaiSan() {
		return maTaiSan;
	}
	public void setMaTaiSan(int maTaiSan) {
		this.maTaiSan = maTaiSan;
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
	public float getSoTienCam() {
		return soTienCam;
	}
	public void setSoTienCam(float soTienCam) {
		this.soTienCam = soTienCam;
	}
	public int getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	// Thêm - Vinh
	private String tenKhachHang;
	private String diaChi;
	private String tenTaiSan;
	private String moTaTaiSan;
	private float mucLaiSuat;
	
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
	

	public String getTenTaiSan() {
		return tenTaiSan;
	}
	public void setTenTaiSan(String tenTaiSan) {
		this.tenTaiSan = tenTaiSan;
	}
	
	public String getMoTaTaiSan() {
		return moTaTaiSan;
	}
	public void setMoTaTaiSan(String moTaTaiSan) {
		this.moTaTaiSan = moTaTaiSan;
	}
	public float getMucLaiSuat() {
		return mucLaiSuat;
	}
	public void setMucLaiSuat(float mucLaiSuat) {
		this.mucLaiSuat = mucLaiSuat;
	}
}
