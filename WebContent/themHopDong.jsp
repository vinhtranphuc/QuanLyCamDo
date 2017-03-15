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
			<div class="container" style="margin-left:375px; margin-top:24px;">
				
				<!-- Thông tin tài sản-->
				<div class="group-asset">
					<h5 style="font-weight: bold;">Thêm Khách Hàng:</h5>
					<html:form action="/themHopDong" method="post" acceptCharset="UTF-8">
						<div style="float: left;">
							<table class="table-info">
								<tr class="row-tableInfo">
									<td>
										Tên Khách Hàng:
									</td>
									<td class="td-input">
										<html:text property="tenKhachHang" styleClass="form-control"></html:text>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td>
										Giới tính:
									</td>
									<td class="td-input">
										<label class="radio-inline"><input type="radio" name="optradio">Nam</label>
										<label class="radio-inline"><input type="radio" name="optradio">Nữ</label>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td>
										Số CMND:
									</td>
									<td class="td-input">
										<html:text property="soCMND" styleClass="form-control"></html:text>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td>
										Địa chỉ
									</td>
									<td class="td-input">
										<html:textarea property="diaChi" styleClass="form-control"></html:textarea>
									</td>
								</tr>
								<tr class="row-tableInfo">
									<td colspan="2">
										<center>
											<html:submit property="themHopDong" styleClass="btn btn-primary" value="Them"/>
											<button type="button" class="btn btn-default">Reset</button>
										</center>
									</td>
								</tr>
							</table>
						</div>
					</html:form>
				</div>
				<!-- endding thông tin tài sản-->
			</div>
			 <div class="panel-body" style="margin-left: 14px; margin-bottom: -4px;">
			 
									<h4> Danh Sách Hợp Đồng:</h4>
                                    <table class="table table-bordered table-hover table-striped">
                                        <thead>
                                            <tr>
                                                <th>Mã HĐ</th>
												<th>Tên Khách Hàng</th>
												<th>Số CMND</th>
                                                <th>Giới tính</th>
												<th>Địa chỉ</th>
												<th>Thao Tác</th>
                                            </tr>
                                        </thead>
                                     <tbody>
                                        <logic:iterate id="hd" name="hopDongForm" property="listHopDong">
                                          <tr>
                                              <td><bean:write name="hd" property="maHopDong"/></td>
                                              <td><bean:write name="hd" property="tenKhachHang"/></td>
                                              <td><bean:write name="hd" property="soCMND"/></td>
                                              <td><bean:write name="hd" property="gioiTinh"/></td>
											  <td><bean:write name="hd" property="diaChi"/></td>
                                      	 <td>
                                         <bean:define id="maHopDong" name="hd" property="maHopDong"></bean:define>
								            <html:link action="/themChiTietHopDong?maHopDong=${maHopDong}">
								              <span class="	glyphicon glyphicon-plus">Thêm chi tiết</span>
								            </html:link>
                                       </td>
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
