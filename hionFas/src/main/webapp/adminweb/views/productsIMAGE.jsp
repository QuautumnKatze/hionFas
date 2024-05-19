<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Gallery</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome -->
<!-- Font Awesome -->
<link rel="stylesheet" 
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- Ekko Lightbox -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/adminweb/assets/plugins/ekko-lightbox/ekko-lightbox.css">
<!-- Theme style -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/adminweb/assets/dist/css/adminlte.min.css">

<script type="text/javascript">
	function doDelete(piid) {
		if (confirm("Chắc chắn xóa hình ảnh này?")) {
			window.location = "AdminProductsImageDeleteServlet?piID=" + piid;
		}
	}
</script>
</head>
<body class="hold-transition sidebar-mini">
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
							<h1>Danh sách hình ảnh sản phẩm</h1>
						</div>
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a
									href="${pageContext.request.contextPath}/AdminHomeServlet">Trang
										chủ</a></li>
								<li class="breadcrumb-item "><a
									href="${pageContext.request.contextPath}/AdminProductsServlet">Quản
										lý sản phẩm</a></li>
								<li class="breadcrumb-item active">Danh sách hình ảnh sản phẩm</li>
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
						<div class="col-8">
							<div class="card card-primary">
								<div class="card-header">
									<h4 class="card-title">Danh sách hình ảnh</h4>
								</div>
								<div class="card-body">
									<div class="row">
										<c:forEach items="${requestScope.ProductImageList }" var="pimage">
											<div class="col-sm-2 border border-secondary">
												<a href="https://via.placeholder.com/1200/FFFFFF.png?text=1"
													data-toggle="lightbox" data-title="pimage-${pimage.productImageID }"
													data-gallery="gallery"> 
													<img src="${pageContext.request.contextPath }/${pimage.image }"
													class="img-fluid mb-2"/>
												</a>
												<div class="text-center">
													<button class="btn btn-danger">
														<a href="#"
															onclick="doDelete('${pimage.productImageID }')"
															class="text-dark"> <i class="fa-solid fa-trash"></i>
														</a>
													</button>
												</div>
											</div>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
						<div class="col-4">
						<c:set value="${requestScope.ProductData }" var="prod"></c:set>
							<div class="card card-primary card-outline">
								<div class="card-body box-profile">
									<h3 class="profile-username text-center">${prod.productName }</h3>

									<p class="text-muted text-center">${prod.shortDes }</p>
									<div class="text-center">
										<button class="btn btn-success text-center text-light" data-toggle="modal" data-target="#AddImage">
											<i class="fa-solid fa-image"></i>  Thêm ảnh
										</button>
									</div>
								</div>
								<!-- /.card-body -->
							</div>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Modal -->
		<div class="modal fade" id="AddImage" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Thêm ảnh</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<form action="AdminProductsImageAddServlet" method="get">
						<div class="modal-body">
							<div class="form-group">
								<label>Mã Sản Phẩm: </label>
								<input type="text" class="form-control" placeholder="Enter ..." name="pid" value="${prod.productID }" readonly>
							</div>
							<div class="form-group">
								<label for="formFile" class="form-label">Hình ảnh sản
									phẩm</label>
								<div class="custom-file">
									<input type="file" class="custom-file-input" name="image">
									<label class="custom-file-label" for="customFile">Chọn
										file</label>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Đóng</button>
							<button type="submit" class="btn btn-primary">
								Hoàn tất
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>

		<%@include file="partial/footer.jsp" %>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>
		<!-- /.control-sidebar -->
	</div>
	<!-- ./wrapper -->

	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/adminweb/assets/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="${pageContext.request.contextPath}/adminweb/assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- Ekko Lightbox -->
	<script src="${pageContext.request.contextPath}/adminweb/assets/plugins/ekko-lightbox/ekko-lightbox.min.js"></script>
	<!-- AdminLTE App -->
	<script src="${pageContext.request.contextPath}/adminweb/assets/dist/js/adminlte.min.js"></script>
	<!-- Filterizr-->
	<script src="${pageContext.request.contextPath}/adminweb/assets/plugins/filterizr/jquery.filterizr.min.js"></script>
	<!-- Page specific script -->
	<script>
		$(function() {
			$(document).on('click', '[data-toggle="lightbox"]',
					function(event) {
						event.preventDefault();
						$(this).ekkoLightbox({
							alwaysShowClose : true
						});
					});

			$('.filter-container').filterizr({
				gutterPixels : 3
			});
			$('.btn[data-filter]').on('click', function() {
				$('.btn[data-filter]').removeClass('active');
				$(this).addClass('active');
			});
		})
	</script>
</body>
</html>
