<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrapper bg-white">
		<div class="h2 text-center">Đăng nhập</div>
		<div class="h4 text-muted text-center pt-2">Wellcome</div>
		<%--  <% if (request.getAttribute("error") != null) { %>
        <p style="text-align: center; margin-top: 17px;color: red;margin-bottom: 0">${error}</p>
    <% } %> --%>
		<form action="/hionFas/login" method="post" class="pt-3">
			<div class="form-group py-2">
				<div class="input-field">
					<span class="far fa-user p-2"></span> <input type="text"
						placeholder="Username" class="" name="user"
						value="${cookie.cuser.value }">
				</div>
			</div>
			<div class="form-group py-1 pb-2">
				<div class="input-field">
					<span class="fas fa-lock p-2"></span> <input type="text"
						placeholder="Password" class="" name="pass"
						value="${cookie.cpass.value }">
					<button class="btn bg-white text-muted">
						<span class="far fa-eye-slash"></span>
					</button>
				</div>
			</div>
			<div class="form-group py-1 pb-2">
				<div class="input-field">
					<span class="fas fa-lock p-2"></span> <input type="text"
						placeholder="Enter the Password" class="" name="pass"
						value="${cookie.cpass.value }">
					<button class="btn bg-white text-muted">
						<span class="far fa-eye-slash"></span>
					</button>
				</div>
			</div>
			<button style="cursor: pointer;" type="submit"
				class="btn btn-block text-center my-3">Log in</button>
			<div class="text-center pt-3 text-muted">
				Not a member? <a href="#">Sign up</a>
			</div>
		</form>
	</div>
</body>
</html>