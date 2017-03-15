package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.ChiTietHopDong;
import model.bean.DanhMucTaiSan;

public class ChiTietHopDongDAO extends DataProvider {

	public ArrayList<DanhMucTaiSan> getListDanhMuc() {
		String querry="select * from DanhMucTaiSan";
		DanhMucTaiSan danhMucTaiSan;
		ArrayList<DanhMucTaiSan> listDanhMuc=new ArrayList<DanhMucTaiSan>();
		try {
		ResultSet rs=exQ(querry);
		while(rs.next())
		{
			danhMucTaiSan=new DanhMucTaiSan();
			danhMucTaiSan.setMaDanhMuc(rs.getInt("MaDanhMuc"));
			danhMucTaiSan.setTenDanhMuc(rs.getString("TenDanhMuc"));
			listDanhMuc.add(danhMucTaiSan);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listDanhMuc;
	}

	public ArrayList<ChiTietHopDong> getListChiTietHopDong(int maHopDong) {
	String querry="select cthd.MaCTHD,kh.TenKhachHang,kh.DiaChi,ts.TenTaiSan,ts.MoTa,cthd.NgayCam,cthd.NgayTra,cthd.SoTienCam,ls.MucLaiSuat from ChiTietHopDong as cthd,TaiSan as ts,HopDong as hd, KhachHang as kh, LaiSuat as ls where cthd.MaTaiSan=ts.MaTaiSan and cthd.MaLaiSuat=ls.MaLaiSuat and hd.MaHopDong=cthd.MaHopDong and hd.MaKhachHang=kh.MaKhachHang and hd.MaHopDong="+maHopDong+"";
	
	ArrayList<ChiTietHopDong> listCTHD=new ArrayList<ChiTietHopDong>();
	ChiTietHopDong cthd;
	try {
		ResultSet rs=exQ(querry);
		while(rs.next())
		{
		cthd=new ChiTietHopDong();
		cthd.setMaCTHD(rs.getInt("MaCTHD"));
		cthd.setTenKhachHang(rs.getString("TenKhachHang"));
		cthd.setDiaChi(rs.getString("DiaChi"));
		cthd.setTenTaiSan(rs.getString("TenTaiSan"));
		cthd.setMoTaTaiSan(rs.getString("MoTa"));
		cthd.setNgayCam(rs.getString("NgayCam"));
		cthd.setNgayTra(rs.getString("NgayTra"));
		cthd.setSoTienCam(rs.getFloat("SoTienCam"));
		cthd.setMucLaiSuat(rs.getFloat("MucLaiSuat"));
	
		listCTHD.add(cthd);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return listCTHD;
	}

	public void themTaiSan(int maTaiSan, int maDanhMuc, String tenTaiSan, int tinhTrang, String moTaTaiSan,
			String urlHinhAnh) {
	String querry="insert into TaiSan values('"+maTaiSan+"','"+maDanhMuc+"','"+tenTaiSan+"','"+tinhTrang+"','"+moTaTaiSan+"','"+urlHinhAnh+"')";
	try {
	exU(querry);
	System.out.println("ChiTietHopDongDAO/themTaiSan: success!");
	} catch (SQLException e) {
		System.out.println("ChiTietHopDongDAO/themTaiSan: lỗi cmnr!");
		e.printStackTrace();
	}
	}
}
