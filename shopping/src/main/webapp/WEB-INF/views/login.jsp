<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
body {
	padding-top: 20px;
}
</style>
<body>
<%@ include file="/WEB-INF/views/Menu.jsp" %>
	<div class="container">
	<center>${message }</center>
		                           

		<%-- <form name='login' action="<c:url value="/login" />" method='POST'>
		</form>

		<c:url value="/logout" var="logoutUrl" />
		<form id="logout" action="logout" method="post">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<a href="javascript:document.getElementById('logout').submit()">Logout</a>
		</c:if> --%>

		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
				<c:if test="${not empty error}">
			<center><h3><div style="color : red" class="error">${error}</div></h3></center>
			
		</c:if>
		
		<c:if test="${not empty logout}">
			<center><h3><div style="color : green" class="msg">${logout}</div></h3></center>
		</c:if>  
					<div class="panel-heading">
						<h3 class="panel-title">Please Log in</h3>
					</div>
					<div class="panel-body">
						<form accept-charset="UTF-8" role="form" action="loginpage" method="post">
							
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="E-mail" name="un"
										type="text">
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password"
										name="password" type="password" value="">
								</div>

								<input class="btn btn-lg btn-success btn-block" type="submit"
									value="Login">
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>