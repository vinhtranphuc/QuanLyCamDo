<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin - Quản lý cửa tiệm cầm đồ</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <!-- <link href="css/morris.css" rel="stylesheet"> -->

    <!-- Custom Fonts -->
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">SB Admin</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
			
             <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="#"><i class="fa fa-home"></i> Trang chủ</a>
                    </li>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#QuanLyHopDong"><i class="fa fa-fw fa-table"></i> Quản lý hợp đồng <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="QuanLyHopDong" class="collapse">
                            <li>
                                <a href="file:///E:/camdo/Quanlicamdo/ThemHopDong.html">Thêm Hợp Đồng</a>
                            </li>
                            <li>
                                <a href="file:///E:/camdo/Quanlicamdo/DanhSachHopDong.html">Danh Sách Hợp Đồng</a>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-fw fa-desktop"></i>Quản lý sản phẩm</a>
                    </li>    
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#ThongKe"><i class="fa fa-fw fa-table"></i> Thống kê <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="ThongKe" class="collapse">
                            <li>
                                <a href="#">Hợp đồng</a>
                            </li>
                            <li>
                                <a href="#">Doanh thu</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>
        <div id="page-wrapper">
			<div class="container" style="margin-left:229px; margin-top:24px;">
				
				<!-- Thông tin tài sản-->
				<html:form action="/themChiTietHopDong" acceptCharset="UTF-8">
				<div class="group-asset">
					<h5 style="font-weight: bold;">Thêm tài sản:</h5>
						<div style="float: left;">
							<table class="table-info">
								<tr class="row-tableInfo">
									<td >
										Chọn danh mục:
									</td>
									<td class="td-input">
										<html:select styleClass="form-control" property="maDanhMuc">
											<option value="">-- Chọn danh mục:</option>
											<html:optionsCollection name="chiTietHopDongForm" property="listDanhMuc" label="tenDanhMuc" value="maDanhMuc"/>
										</html:select>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td>
										Tên tài sản:
									</td>
									<td class="td-input">
										<html:text property="tenTaiSan" styleClass="form-control"></html:text>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td>
										Mô tả:
									</td>
									<td class="td-input">
										<html:textarea property="moTaTaiSan" styleClass="form-control"></html:textarea>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td>
										Hình ảnh:
									</td>
									<td class="td-input">
										<button type="button" style="margin-left: 40px;"class="btn btn-primary">Chọn hình ảnh</button>
									</td>
								</tr>
							</table>
						</div>
				</div>
				<!-- endding thông tin tài sản-->
				<!-- Thông tin tài sản-->
				<div class="group-asset" style="height: 212px;">
					<h5 style="font-weight: bold;">Thêm hợp đồng:</h5>
						<div style="float: left;">
							<table class="table-info">
								<tr class="row-tableInfo">
									<td>
										Giá cầm:
									</td>
									<td class="td-input">
								<html:text property="soTienCam" name="chiTietHopDongForm" styleClass="form-control"></html:text>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td>
										Hợp đồng đến:
									</td>
									<td class="td-input">
								<html:text property="ngayTra" name="chiTietHopDongForm" styleClass="form-control"></html:text>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td colspan="2">
							<div style="margin-right: -5px;">
						<center style="margin-top: 26px;">
							<div class="col-lg-2 pull-right">
            		<html:link styleClass="btn btn-info" style="margin-left: -364px;" action="/tinhLaiSuat">Tính Lãi Suất</html:link>
            				</div>
            		<html:submit property="datHopDong" value="Đặt Hợp Đồng" style="margin-right:-162px;"  styleClass="btn btn-danger" >Đặt Hợp Đồng</html:submit>
						</center>
							</div>
									</td>
								</tr>
							</table>
						</div>
				</div>
				</html:form>
				<!-- endding thông tin tài sản-->
			</div>
			 <div class="panel-body" style="margin-left: 14px; margin-bottom: -4px;">
									<h4> Danh Sách Hợp Đồng:</h4>
                                    <table class="table table-bordered table-hover table-striped">
                                        <thead>
                                            <tr>
                                                <th>Mã CTHĐ</th>
												<th>Tên KH</th>
												<th>Địa chỉ</th>
                                                <th>Tên tài sản</th>
                                                <th>Mô tả</th>
                                                <th>Ngày cầm</th>
												<th>Ngày trả</th>
												<th>Số tiền cầm</th>
												<th>Mức lãi suất</th>
												<th> Chi tiết </th>
                                            </tr>
                                        </thead>
                                        <tbody>
                          <logic:iterate id="cthd" property="listChiTietHopDong" name="chiTietHopDongForm">
                            <tr>
                                <td><bean:write name="cthd" property="maCTHD"></bean:write></td>
                                <td><bean:write name="cthd" property="tenKhachHang"></bean:write></td>
                                <td><bean:write name="cthd" property="diaChi"></bean:write></td>
                                <td><bean:write name="cthd" property="tenTaiSan"></bean:write></td>
								<td><bean:write name="cthd" property="moTaTaiSan"></bean:write></td>
                               <td><bean:write 	name="cthd" property="ngayCam"></bean:write></td>
                                <td><bean:write name="cthd" property="ngayTra"></bean:write></td>
                                <td><bean:write name="cthd" property="soTienCam"></bean:write></td>
								<td><bean:write name="cthd" property="mucLaiSuat"></bean:write></td>
								<td><a href="/chitiethopdong">Xem</a></td>
                                            </tr>
                          </logic:iterate>
                                        </tbody>
                                    </table>
									<ul style="margin-left: 77%;margin-top: 0%;" class="pagination pagination-lg">
										<li><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">5</a></li>
									  </ul>
							</div>
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
