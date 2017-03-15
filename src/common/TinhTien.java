package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TinhTien {	

	public int demNgay(String ngayBatDau,String ngayKetThuc) throws ParseException
	{
		 Calendar cal1 = new GregorianCalendar();
	     Calendar cal2 = new GregorianCalendar();

	     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	     Date date = sdf.parse(ngayBatDau);
	     cal1.setTime(date);
	     date = sdf.parse(ngayKetThuc);
	     cal2.setTime(date);
	     return (int)( (cal2.getTime().getTime() - cal1.getTime().getTime()) / (1000 * 60 * 60 * 24));
	}
	
	public int mucLaiSuat(String ngayBatDau,String ngayKetThuc,float soTienCam) throws ParseException
	{
	int soNgay=demNgay(ngayBatDau,ngayKetThuc);

	if(soNgay<90)
	{
		if(soTienCam<20000) return 1;
		if(soTienCam<40000) return 2;
		if(soTienCam<60000) return 3;
		if(soTienCam<80000) return 4;
	}
	else if(90<=soNgay&&soNgay<180)
	{
		if(soTienCam<20000) return 3;
		if(soTienCam<40000) return 4;
		if(soTienCam<60000) return 5;
		if(soTienCam<80000) return 6;
	}
	else if(180<=soNgay&&soNgay<360)
	{
		if(soTienCam<20000) return 5;
		if(soTienCam<40000) return 6;
		if(soTienCam<60000) return 7;
		if(soTienCam<80000) return 8;
	}
	return 9999;
	}
	
	
	
	public static void main(String[] args) throws ParseException{
	   //  System.out.println("Days= "+demNgay("20-2-2017","20-3-2017"));
	}
}
