<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Main Sidebar Container -->
	<aside class="main-sidebar sidebar-dark-primary elevation-4">
		<!-- Brand Logo -->
		<a href="index3.html" class="brand-link"> <img
			src="${pageContext.request.contextPath}/adminweb/assets/dist/img/AdminLTELogo.png"
			alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
			style="opacity: .8"> <span class="brand-text font-weight-light">AdminLTE
				3</span>
		</a>

		<!-- Sidebar -->
		<div class="sidebar">
			<!-- Sidebar user panel (optional) -->
			<div class="user-panel mt-3 pb-3 mb-3 d-flex">
				<div class="image">
					<img
						src="${pageContext.request.contextPath}/adminweb/assets/dist/img/user2-160x160.jpg"
						class="img-circle elevation-2" alt="User Image">
				</div>
				<div class="info">
					<a href="#" class="d-block">Alexander Pierce</a>
				</div>
			</div>

			<!-- SidebarSearch Form -->
			<div class="form-inline">
				<div class="input-group" data-widget="sidebar-search">
					<input class="form-control form-control-sidebar" type="search"
						placeholder="Search" aria-label="Search">
					<div class="input-group-append">
						<button class="btn btn-sidebar">
							<i class="fas fa-search fa-fw"></i>
						</button>
					</div>
				</div>
			</div>

			<!-- Sidebar Menu -->
			<nav class="mt-2">
				<ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
					<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
	            <c:forEach items="${requestScope.AdminMenuData }" var="adminMenu">
	            	<c:if test="${adminMenu.level == 1 }">
	            		<li class="nav-item">
						<a href="${pageContext.request.contextPath }/${adminMenu.link}" class="nav-link"> <i class="nav-icon ${adminMenu.icon }"></i>
									<p>
										${adminMenu.menuName }
									</p>
							</a>
						</li>
	            	</c:if>
	            	<c:if test="${adminMenu.level == 0 }">
	            		<li class="nav-item">
							<a href="#" class="nav-link active"> 
								<i class="nav-icon ${adminMenu.icon }"></i>
									<p>
										${adminMenu.menuName } <i class="right fas fa-angle-left"></i>
									</p>
							</a>
							<ul class="nav nav-treeview">
							<c:forEach items="${requestScope.AdminMenuData }" var="adminMenuChild">
								<c:if test="${adminMenuChild.level == 2 }">
									<li class="nav-item">
										<a href="${pageContext.request.contextPath }/${adminMenuChild.link}" class="nav-link active"> 
											<i class="nav-icon ${adminMenuChild.icon }"></i>
												<p>${adminMenuChild.menuName }</p>
										</a>
									</li>
								</c:if>
								
							</c:forEach>
								
							</ul>
						</li>
	            	</c:if>
	            	
	            </c:forEach>
					
				</ul>
			</nav>
			<!-- /.sidebar-menu -->
		</div>
		<!-- /.sidebar -->
	</aside>

</body>
</html>