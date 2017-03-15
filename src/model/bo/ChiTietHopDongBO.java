package model.bo;

import java.util.ArrayList;

import common.MaTuTang;
import model.bean.ChiTietHopDong;
import model.bean.DanhMucTaiSan;
import model.dao.ChiTietHopDongDAO;

public class ChiTietHopDongBO {
	MaTuTang maTuTang=new MaTuTang();
	ChiTietHopDongDAO chiTietHopDongDAO=new ChiTietHopDongDAO();
	
	public ArrayList<DanhMucTaiSan> getListDanhMuc() {
		return chiTietHopDongDAO.getListDanhMuc();
	}

	public ArrayList<ChiTietHopDong> getListChiTietHopDong(int maHopDong) {
		return chiTietHopDongDAO.getListChiTietHopDong(maHopDong);
	}

	public void themTaiSan(int maDanhMuc, String tenTaiSan, String moTaTaiSan) {
	int maTaiSan=maTuTang.getMaTaiSan();
	int tinhTrang=1;
	String urlHinhAnh="Chưa xu ly";
	chiTietHopDongDAO.themTaiSan(maTaiSan,maDanhMuc,tenTaiSan,tinhTrang,moTaTaiSan,urlHinhAnh);
	}
}
