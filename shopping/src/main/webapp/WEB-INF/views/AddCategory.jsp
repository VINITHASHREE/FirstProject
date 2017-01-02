<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	
<title>ADD CATEGORY</title>

</head>
<body>
<%@ include file="/WEB-INF/views/Menu.jsp" %>
	<div class="container">
		<form class="form-horizontal " role="form" action="newCategory" method="post">
			<h2>Add category form</h2>
			<div class="form-group">
			  <div class="col-sm-9 col-sm-offset-3"> 
			  <label for="categoryname">CategoryName</label>
              <input type="text" id="categoryname" class="form-control" name="cn" >
              	          
               <div class="col-sm-9 col-sm-offset-3">       
              <label for="categorydesc">CategoryDesc</label>
              <input type="text" id="categorydesc" class="form-control" name="cd">
                        
          	
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<center><button type="submit" class="btn btn-success btn-block">ADD</button></center>
				</div>
			</div>
		</div>
	</div>
</div>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>
</html>
