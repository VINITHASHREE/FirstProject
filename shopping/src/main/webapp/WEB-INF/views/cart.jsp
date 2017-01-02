<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value="/resources/js/CartController.js" />"></script>

 <%@ include file="/WEB-INF/views/Menu.jsp" %>
</head>

<body ng-app="addToCartApp" ng-controller="addToCartCtrl" ng-init="retrieveCart('${pageContext.request.userPrincipal.name}')">
 <table class="table table-bordered table-striped fs13" >
		  <thead>
			  <tr>
				
				<th>Image</th>
				<th class="width110">Product</th>
				
				<th>Quantity</th>
				<th>Price(in Rs.)</th>
				<th>Action</th>
			  </tr>
			</thead>
			<tbody>
				<tr ng-repeat = "items in cart">
					 	<td class="span1"><img src="<c:url value="/resources/productImages/{{items.id}}.jpg" /> " alt="{{items.id}}"/></td> 
					 	 
						<td>{{items.pn}}</td>
						
						<td >{{items.quantity}}</td>
						<td>{{items.price}}</td>
						<td><a href="#" class="btn btn-danger btnAction" ng-click="removeItemFromCart(items.cartid)">
							<span class="glyphicon glyphicon-trash"></span>remove</a></td>
					</tr>
			  <tr>
                    <td></td>
                    <td></td>
					<td></td>
                    <td>Grand Total(in Rs.)</td>
                    <td>{{GrandTotalOfItems()}}</td>
                    <td></th>
                </tr>
               
			</tbody>
		  </table>
		  <div class="container">
		  <center>
		    <td>
                        <button type="button" class="btn btn-success">
                            Continue Shopping<span class="glyphicon glyphicon-play"></span>
                        </button>
                      
                         <a href="order/${pageContext.request.userPrincipal.name}"><button type="button" class="btn btn-success">
                            BuyNow <span class="glyphicon glyphicon-briefcase"></span>
                        </button></a>
                      
                         <button type="button" class="btn btn-danger">
                            Cancel <span class="glyphicon glyphicon-remove"></span>
                        </button>
                        </td>
                        
                </center>
                </div>	
                  
</body>
</html>
