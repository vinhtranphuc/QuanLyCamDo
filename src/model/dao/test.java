package model.dao;

import java.util.ArrayList;

import model.bean.ChiTietHopDong;
import model.bean.DanhMucTaiSan;
import model.bean.KhachHang;
import model.bo.ChiTietHopDongBO;
import model.bo.HopDongBO;

public class test {
	public static void main(String[] args) {
		
		//testListKhachHang();
		//testListDanhMuc();
		testListCTHD();
		
	}
	public static void testListKhachHang()	
	{
		ArrayList<KhachHang> listKhachHang=new ArrayList<KhachHang>();
		HopDongBO hopDongBO=new HopDongBO();
		listKhachHang=hopDongBO.getListHopDong();
		
		System.out.println(listKhachHang.size());
		
		for(KhachHang khachHang:listKhachHang)
		{
			System.out.println(khachHang.getMaHopDong()+" ");
			System.out.println(khachHang.getTenKhachHang()+" ");
			System.out.println(khachHang.getSoCMND()+" ");
			System.out.println(khachHang.getGioiTinh()+" ");
			System.out.println(khachHang.getDiaChi()+" ");
		}
	}
	
	public static void testListDanhMuc()	
	{
		ArrayList<DanhMucTaiSan> listDanhMuc=new ArrayList<DanhMucTaiSan>();
		ChiTietHopDongBO chiTietHopDongBO=new ChiTietHopDongBO();
		listDanhMuc=chiTietHopDongBO.getListDanhMuc();
		
		System.out.println("Size: "+listDanhMuc.size());
		
		for(DanhMucTaiSan danhMuc:listDanhMuc)
		{
			System.out.println(danhMuc.getMaDanhMuc()+" ");
			System.out.println(danhMuc.getTenDanhMuc()+" ");
		}
	}
	
	public static void testListCTHD()
	{
		ArrayList<ChiTietHopDong> listCTHD=new ArrayList<ChiTietHopDong>();
		ChiTietHopDongBO cthdBO=new ChiTietHopDongBO();
		listCTHD=cthdBO.getListChiTietHopDong(1);
		
		System.out.println("Size: "+listCTHD.size());
		
		for(ChiTietHopDong cthd:listCTHD)
		{
			System.out.println("MaCTHD: "+cthd.getMaCTHD());
			System.out.println("TenKH: "+cthd.getTenKhachHang());
			System.out.println("DiaChi: "+cthd.getDiaChi());
			System.out.println("TenTS: "+cthd.getTenTaiSan());
			System.out.println("MoTaTS: "+cthd.getMoTaTaiSan());
			System.out.println("NgayCam: "+cthd.getNgayCam());
			System.out.println("NgayTra: "+cthd.getNgayTra());
			System.out.println("SoTienCam: "+cthd.getSoTienCam());
			System.out.println("MucLS: "+cthd.getMucLaiSuat());
			
			System.out.println("---------------");
		}
	}
	
}
