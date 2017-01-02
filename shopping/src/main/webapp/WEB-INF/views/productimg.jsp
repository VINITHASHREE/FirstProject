 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script src="<c:url value="/resources/js/CartController.js"/>"></script>
<style>
  .product {
	border: 1px solid #dddddd;
	height: 321px;
}

.product>img {
	max-width: 230px;
}


.product-title {
	font-size: 20px;
}

.product-desc {
	font-size: 14px;
}

.product-price {
	font-size: 22px;
}

.product-stock {
	color: #74DF00;
	font-size: 20px;
	margin-top: 10px;
}

.product-info {
	margin-top: 50px;
}


.content-wrapper {
	max-width: 1140px;
	background: #fff;
	margin: 0 auto;
	margin-top: 25px;
	margin-bottom: 10px;
	border: 0px;
	border-radius: 0px;
}

.container-fluid {
	max-width: 1140px;
	margin: 0 auto;
}

.view-wrapper {
	float: right;
	max-width: 70%;
	margin-top: 25px;
}

.container {
	padding-left: 0px;
	padding-right: 0px;
	max-width: 100%;
}
 
 .service1-items {
	padding: 0px 0 0px 0;
	float: left;
	position: relative;
	overflow: hidden;
	max-width: 100%;
	height: 321px;
	width: 130px;
}

.service1-item {
	height: 107px;
	width: 120px;
	display: block;
	float: left;
	position: relative;
	padding-right: 20px;
	border-right: 1px solid #DDD;
	border-top: 1px solid #DDD;
	border-bottom: 1px solid #DDD;
}

.service1-item>img {
	max-height: 110px;
	max-width: 110px;
	opacity: 0.6;
	transition: all .2s ease-in;
	-o-transition: all .2s ease-in;
	-moz-transition: all .2s ease-in;
	-webkit-transition: all .2s ease-in;
}

.service1-item>img:hover {
	cursor: pointer;
	opacity: 1;
}

.service-image-left {
	padding-right: 50px;
}

.service-image-right {
	padding-left: 50px;
}

.service-image-left>center>img, .service-image-right>center>img {
	max-height: 155px;
} */ 
</style>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<%@ include file="/WEB-INF/views/Menu.jsp" %>
<body ng-app="addToCartApp" ng-controller="addToCartCtrl">


		<div class="container-fluid">
			<div class="content-wrapper">
				<div class="item-container">
					<div class="container">
						<div class="col-md-12">
							<div class="product col-md-3 service-image-left">


								<img id="item-display" alt="${p.id}"
									src="<c:url value="/resources/productImages/${p.id}.jpg"></c:url>">

							</div>

							<div class="container service1-items col-sm-2 col-md-2 pull-left">

								<a id="item-1" class="service1-item"> <img alt="${p.id}"
									src="<c:url value="/resources/productImages/${p.id}.jpg"></c:url>">
								</a> <a id="item-2" class="service1-item"> <img alt="${p.id}"
									src="<c:url value="/resources/productImages/${p.id}.jpg"></c:url>">
								</a> <a id="item-3" class="service1-item"> <img alt="${p.id}"
									src="<c:url value="/resources/productImages/${p.id}.jpg"></c:url>">
								</a>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="col-md-7" style="    float: right;
    margin-top: -22%;">
			<div class="product-title">${p.pn}</div>
			<div class="product-desc">${p.description}</div>
			
			<hr>
			<div class="product-price">${p.price}</div>  
			<div class="product-stock">In Stock</div>
			<hr>
			<div class="btn-group cart">
				<button type="button" class="btn btn-success" ng-click="addtocart('${p.id }')" type="button">Add to cart</button>
			</div>
			<div class="btn-group wishlist">
				<button type="button" class="btn btn-danger">Add to
					wishlist</button>
			</div>
		</div>

</body>
</html>