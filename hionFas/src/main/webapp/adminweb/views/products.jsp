<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Dashboard</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<link rel="stylesheet" 
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Tempusdominus Bootstrap 4 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
<!-- iCheck -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- JQVMap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/jqvmap/jqvmap.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/dist/css/adminlte.min.css">
<!-- overlayScrollbars -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/daterangepicker/daterangepicker.css">
<!-- summernote -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/summernote/summernote-bs4.min.css">
<!-- DataTables -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
<script type="text/javascript">
	function doDelete(id) {
		if (confirm("Chắc chắn xóa sản phẩm này?")) {
			window.location = "AdminProductsDeleteServlet?id=" + id;
		}
	}
</script>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">
		<%@include file="partial/header.jsp"%>
		<%@include file="partial/sidebar.jsp" %>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>Quản lý sản phẩm</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
								<li class="breadcrumb-item active">Quản lý sản phẩm</li>
							</ol>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-12">
							<div class="card">
								<div class="card-header">
									<h3 class="card-title">Danh sách sản phẩm</h3>
								</div>
								<!-- /.card-header -->
								<div class="card-body">
									<table id="example1" class="table table-bordered table-striped">
										<thead>
											<tr>
												<th>ProductID</th>
												<th>ProductName</th>
												<th>Image</th>
												<th>IsActive</th>
												<th>IsNew</th>
												<th>IsBestSeller</th>
												<th>Feature</th>
											</tr>
										</thead>
										<tbody>
										<c:forEach items="${requestScope.ProductData }" var="Product">
												<tr>
													<td class="text-center">${Product.productID}</td>
													<td class="text-center">${Product.productName}</td>
													<td class="text-center">
														<img src="${pageContext.request.contextPath }/${Product.image}" alt="" width="80px">
													</td>
													<td class="text-center">
														<c:if test="${Product.isActive() == true }">
																<a href="#" class="fs-6 text-success"><i class="fa-solid fa-circle-check"></i></a>
														</c:if>
														<c:if test="${Product.isActive() == false }">
															
																<a href="#" class="text-secondary"><i class="fa-regular fa-circle-check"></i></a>
														</c:if>
													</td>
													<td class="text-center">
														<c:if test="${Product.isNew() == true }">
																<a href="#" class="fs-6 text-success"><i class="fa-solid fa-circle-check"></i></a>
														</c:if>
														<c:if test="${Product.isNew() == false }">
															
																<a href="#" class="text-secondary"><i class="fa-regular fa-circle-check"></i></a>
														</c:if>
													</td>
													<td class="text-center">
														<c:if test="${Product.isBestSeller() == true }">
																<a href="#" class="fs-6 text-success"><i class="fa-solid fa-circle-check"></i></a>
														</c:if>
														<c:if test="${Product.isBestSeller() == false }">
															
																<a href="#" class="text-secondary"><i class="fa-regular fa-circle-check"></i></a>
														</c:if>
													</td>
													<td class="text-center">
														<button class="btn btn-warning">
															<a href="AdminProductsEditServlet?id=${Product.productID }" class="text-dark"><i class="fa-solid fa-pen-to-square"></i></a>
														</button>
														<button class="btn btn-success">
															<a href="AdminProductsImageServlet?id=${Product.productID }" class="text-dark"><i class="fa-solid fa-image"></i></a>
														</button>
														<button class="btn btn-primary">
															<a href="AdminProductsSizeColorServlet?id=${Product.productID }" class="text-dark"><i class="fa-solid fa-bars"></i></a>
														</button>
														<button class="btn btn-info">
															<a href="AdminProductsDetailServlet?id=${Product.productID }" class="text-dark"><i class="fa-solid fa-circle-info"></i></a>
														</button>
														<button class="btn btn-danger">
															<a href="#" onclick="doDelete('${Product.productID}')" class="text-dark"><i class="fa-solid fa-trash"></i></a>
														</button>
													</td>
												</tr>
										</c:forEach>
												
											
										</tbody>
										<tfoot>
											<tr>
												<th>ProductID</th>
												<th>ProductName</th>
												<th>Image</th>
												<th>IsActive</th>
												<th>IsNew</th>
												<th>IsBestSeller</th>
												<th>Feature</th>
											</tr>
										</tfoot>
									</table>
								</div>
								<!-- /.card-body -->
							</div>
							<!-- /.card -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.container-fluid -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		
		<%@include file="partial/footer.jsp" %>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/jquery/jquery.min.js"></script>
	<!-- jQuery UI 1.11.4 -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/jquery-ui/jquery-ui.min.js"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button)
	</script>
	<!-- Bootstrap 4 -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- ChartJS -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/chart.js/Chart.min.js"></script>
	<!-- Sparkline -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/sparklines/sparkline.js"></script>
	<!-- JQVMap -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/jqvmap/jquery.vmap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
	<!-- jQuery Knob Chart -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/jquery-knob/jquery.knob.min.js"></script>
	<!-- daterangepicker -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/moment/moment.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/daterangepicker/daterangepicker.js"></script>
	<!-- Tempusdominus Bootstrap 4 -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
	<!-- Summernote -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/summernote/summernote-bs4.min.js"></script>
	<!-- overlayScrollbars -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
	<!-- AdminLTE App -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/dist/js/adminlte.js"></script>
	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/dist/js/pages/dashboard.js"></script>

	<!-- DataTables  & Plugins -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-buttons/js/dataTables.buttons.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-buttons/js/buttons.bootstrap4.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/jszip/jszip.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/pdfmake/pdfmake.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/pdfmake/vfs_fonts.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-buttons/js/buttons.html5.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-buttons/js/buttons.print.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/datatables-buttons/js/buttons.colVis.min.js"></script>
	<!-- Page specific script -->
	<script>
		$(function() {
			$("#example1").DataTable(
					{
						"responsive" : true,
						"lengthChange" : false,
						"autoWidth" : false,
						"buttons" : [ "copy", "csv", "excel", "pdf", "print",
								"colvis" ]
					}).buttons().container().appendTo(
					'#example1_wrapper .col-md-6:eq(0)');
			$('#example2').DataTable({
				"paging" : true,
				"lengthChange" : false,
				"searching" : false,
				"ordering" : true,
				"info" : true,
				"autoWidth" : false,
				"responsive" : true,
			});
		});
	</script>
</body>
</html>
