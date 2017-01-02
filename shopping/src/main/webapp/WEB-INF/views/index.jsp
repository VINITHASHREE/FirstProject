<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>WOMEN'S SHOPPING</title>
<script type="text/javascript">
	$(function() {
		$(".dropdown").hover(function() {
			$('.dropdown-menu', this).stop(true, true).fadeIn("fast");
			$(this).toggleClass('open');
			$('b', this).toggleClass("caret caret-up");
		}, function() {
			$('.dropdown-menu', this).stop(true, true).fadeOut("fast");
			$(this).toggleClass('open');
			$('b', this).toggleClass("caret caret-up");
		});
	});
</script>

</head>

<body>


<%@ include file="/WEB-INF/views/Menu.jsp" %>

	<div class="container">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Carousel indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>
				<li data-target="#myCarousel" data-slide-to="5"></li>
			</ol>
			<!-- Wrapper for carousel items -->
			<div class="carousel-inner">
				<div class="item active">
					<div>
						<img src="<c:url value="/resources/images/a.jpg"/>" width="100%"
							height="350px">
					</div>
				</div>
				<div class="item">
					<div>
						<img src="<c:url value="/resources/images/b.jpg" />" width="100%"
							height="350px">
					</div>

				</div>
				<div class="item">
					<div>
						<img src="<c:url value="/resources/images/c.jpg"/>" width="1800"
							height="350px">
					</div>
				</div>
				<div class="item">
					<div>
						<img src="<c:url value="/resources/images/d.jpg"/>" width="1800"
							height="350px">
					</div>
				</div>
				<div class="item">
					<div>
						<img src="<c:url value="/resources/images/image2.jpg"/>" width="1800"
							height="350px">
					</div>
				</div>
				<div class="item">
					<div>
						<img src="<c:url value="/resources/images/e.jpg"/>" width="1800"
							height="350px">
					</div>
				</div>
			</div>
			<!-- Carousel controls -->
			<a class="carousel-control left" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span>
			</a> <a class="carousel-control right" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div>
	
<%@ include file="/WEB-INF/views/ProductList.jsp" %>
</body>

</html>

