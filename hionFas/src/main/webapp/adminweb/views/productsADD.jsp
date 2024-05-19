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
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
	integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
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

<!-- include libraries(jQuery, bootstrap) -->
<script type="text/javascript"
	src="//code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet"
	href="//cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" />
<script type="text/javascript"
	src="cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- include summernote css/js-->
<link href="summernote-bs5.css" rel="stylesheet">
<script src="summernote-bs5.js"></script>

</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">
		<%@include file="partial/header.jsp"%>
		<%@include file="partial/sidebar.jsp"%>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1>Thêm mới sản phẩm</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a
									href="${pageContext.request.contextPath}/AdminHomeServlet">Trang
										chủ</a></li>
								<li class="breadcrumb-item "><a
									href="${pageContext.request.contextPath}/AdminProductsServlet">Quản
										lý sản phẩm</a></li>
								<li class="breadcrumb-item active">Thêm mới sản phẩm</li>
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
						<!-- right column -->
						<div class="col-md-12">
							<!-- general form elements disabled -->
							<div class="card card-warning">
								<div class="card-header">
									<h3 class="card-title">Thông tin sản phẩm</h3>
								</div>
								<!-- /.card-header -->
								<div class="card-body">
									<form id="FormCreate" action="AdminProductsCreateServlet" method="post">
										<div class="row">
											<div class="col-sm-12">
												<!-- select -->
												<div class="form-group">
													<label>Phân loại danh mục: </label> <select name="cid"
														class="form-control">
														<c:forEach items="${requestScope.PCategoryData }"
															var="cate">
															<option value="${cate.pCategoryID }">${cate.pCategoryName }</option>
														</c:forEach>

													</select>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-12">
												<!-- text input -->
												<div class="form-group">
													<label>Tên Sản Phẩm: </label> <input type="text"
														class="form-control" placeholder="Enter ..." name="name">
												</div>

												<div class="form-group">
													<label for="formFile" class="form-label">Hình ảnh
														sản phẩm</label>
													<div class="custom-file">
														<input type="file" class="custom-file-input" name="image">
														<label class="custom-file-label" for="customFile">Choose
															file</label>
													</div>

												</div>

												<div class="form-group">
													<label>Mô tả sơ lược sản phẩm: </label>
													<textarea class="form-control" rows="3"
														placeholder="Enter ..." name="shortDes"></textarea>
												</div>

												<div class="form-group">
													<label>Mô tả chi tiết sản phẩm: </label>
													<textarea class="form-control" rows="5" id="editor"
														name="des"></textarea>
												</div>


												<div class="form-group">
													<label>Giá Sản Phẩm: </label> <input type="number"
														class="form-control" placeholder="Enter ..." name="price">
												</div>

												<div class="form-group">
													<label>Trọng lượng: </label> <input type="text"
														class="form-control" placeholder="Enter ..." name="weight">
												</div>

												<div class="form-group">
													<label>Vật liệu: </label> <input type="text"
														class="form-control" placeholder="Enter ..."
														name="material">
												</div>

												<div class="form-group">
													<label>Xuất xứ: </label> <input type="text"
														class="form-control" placeholder="Enter ..." name="origin">
												</div>

												<div class="form-group">
													<label>Kích thước: </label> <input type="text"
														class="form-control" placeholder="Enter ..."
														name="dimension">
												</div>

												<div class="form-group">
													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															name="isActive"> <label class="form-check-label">Hiển
															thị </label>
													</div>
													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															name="isNew"> <label class="form-check-label">Sản
															phẩm mới </label>
													</div>
													<div class="form-check">
														<input class="form-check-input" type="checkbox"
															name="isBestSeller"> <label
															class="form-check-label">Bán chạy </label>
													</div>

													<div class="container m-3 text-center">
														<button type="submit" class="btn btn-info">Lưu</button>

													</div>
												</div>




											</div>
										</div>
									</form>
								</div>
								<!-- /.card-body -->
							</div>
							<!-- /.card -->
						</div>
						<!--/.col (right) -->
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
	<!-- jquery-validation -->
	<script src="${pageContext.request.contextPath}/adminweb/assets/plugins/jquery-validation/jquery.validate.min.js"></script>
	<script src="${pageContext.request.contextPath}/adminweb/assets/plugins/jquery-validation/additional-methods.min.js"></script>

	<!-- bs-custom-file-input -->
	<script
		src="${pageContext.request.contextPath}/adminweb/assets/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
	<!-- CKEDITOR -->
	<script src="https://cdn.ckeditor.com/4.22.1/full/ckeditor.js"></script>


	<!-- Page specific script -->
	<script>
		$(function() {
			bsCustomFileInput.init();
		});
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#summernote').summernote();
		});
		
		$(function () {
			  $('#FormCreate').validate({
			    rules: {
			    	name: {
			        required: true,
			        minlength: 3
			      },
			      password: {
			        required: true,
			        minlength: 5
			      },
			      terms: {
			        required: true
			      },
			    },
			    messages: {
			      name: {
			        required: "Tên sản phẩm không được bỏ trống",
			        minlength: "Tên sản phẩm quá ngắn"
			      },
			      password: {
			        required: "Please provide a password",
			        minlength: "Your password must be at least 5 characters long"
			      },
			      terms: "Please accept our terms"
			    },
			    errorElement: 'span',
			    errorPlacement: function (error, element) {
			      error.addClass('invalid-feedback');
			      element.closest('.form-group').append(error);
			    },
			    highlight: function (element, errorClass, validClass) {
			      $(element).addClass('is-invalid');
			    },
			    unhighlight: function (element, errorClass, validClass) {
			      $(element).removeClass('is-invalid');
			    }
			  });
			});
	</script>

	<script type="text/javascript">
		CKEDITOR.replace('editor', {
			height : 400,
			baseFloatZIndex : 10005,
			removeButtons : 'PasteFromWord'
		});
	</script>
	
	
</body>
</html>
