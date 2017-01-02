<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">

	<div class="container">
		<div class="navbar-header">

			<div>
				<img src="<c:url value="/resources/images/logo.png"/>" width="100"
					height="75px">
			</div>
		</div>

		<ul class="nav navbar-nav navbar-left">
			<li class="active"><a href="home">Home
					${pageContext.request.userPrincipal.name}</a></li>

			<c:if test="${pageContext.request.userPrincipal.name!='vishnu' }">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Clothing<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Kurtis</a></li>
						<li><a href="#">Sarees</a></li>
						<li><a href="#">Dress materials</a></li>
						<li><a href="#">Salwar and Dupattas</a></li>
						<li><a href="#">Lehengas</a></li>
						<li><a href="#">T-Shirts and Shirts</a></li>
						<li><a href="#">Jeans and Legins</a></li>
					</ul>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Footwear<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Flats</a></li>
						<li><a href="#">Heels</a></li>
						<li><a href="#">Casual shoes</a></li>
						<li><a href="#">Sport shoes</a></li>
						<li><a href="#">Boots</a></li>
						<li><a href="#">Bellies</a></li>
					</ul>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Accessories<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Handbags</a></li>
						<li><a href="#">Wallets</a></li>
						<li><a href="#">Luggages</a></li>
						<li><a href="#">Sunglasses</a></li>
					</ul>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Watches<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Fastrack</a></li>
						<li><a href="#">Titan</a></li>
						<li><a href="#">Sonata</a></li>
						<li><a href="#">Rollex</a></li>
					</ul>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Jewellery<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Necklace and Sets</a></li>
						<li><a href="#">Earings</a></li>
						<li><a href="#">Bangles and Bracelets</a></li>
						<li><a href="#">Silver Jewellery</a></li>
						<li><a href="#">Gold Jewellery</a></li>
					</ul></li>
			</c:if>
			<c:if test="${pageContext.request.userPrincipal.name=='vishnu' }">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Product<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="getproduct">Add</a></li>
						<li><a href="viewproduct">View</a></li>
					</ul>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Category<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="getcategory">Add</a></li>
						<li><a href="viewcategory">View</a></li>
					</ul>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Supplier<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="getsupplier">Add</a></li>
						<li><a href="viewsupplier">View</a></li>
					</ul></li>
			</c:if>
		</ul>


		<ul class="nav navbar-nav navbar-right">
			<c:if test="${pageContext.request.userPrincipal.name == null }">
				<li><a href="getlogin">Login</a></li>
				<li><a href="getRegister">Register</a></li>
			</c:if>
			
			<c:if 
				test="${pageContext.request.userPrincipal.name !=null}">
			<c:if test="${pageContext.request.userPrincipal.name!='vishnu' &&  pageContext.request.userPrincipal.name != null }">
			
				<li><a href="viewcart"><span
						class="glyphicon glyphicon-shopping-cart"> Cart</span></a></li>
						</c:if>
				<li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li>
			</c:if>
<%-- <c:if test="${pageContext.request.userPrincipal.name != null }">
						 <li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart"> Cart</span></a></li> 
					    </c:if> --%> 
		</ul>
	</div>
</nav>