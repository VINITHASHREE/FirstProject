<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript">
	var app = angular.module('myApp',[]);
	app.controller("ProductController",function($scope,$http){
		$scope.getdata = function(){
			$http({
				method : 'GET',
				url : 'viewproductlist'
			}).success(function(data, status ,headers, config){
				$scope.result = data;
				alert("success");
			}).error(function(data, status, headers, config){
				alert("error");
			});
		}
	});
		
		
</script>
</head>
<body>
<%@ include file="/WEB-INF/views/Menu.jsp" %>
<div ng-app="myApp" ng-controller="ProductController" ng-init="getdata()">
<table>
<tr>
<th>id</th>
<th>pn</th>
<th>size</th>
<th>quantity</th>
<th>price</th>
<th>cid</th>
<th>sid</th>
<th>description</th>
</tr>
<tr ng-repeat="items in result">
<th>{{items.id}}</th>
<th>{{items.pn}}</th>
<th>{{items.size}}</th>
<th>{{items.quantity}}</th>
<th>{{items.price}}</th>
<th>{{items.cid}}</th>
<th>{{items.sid}}</th>
<th>{{items.description}}</th>
<th><a href="editproduct/{{items.id}}">edit</a></th>
<th><a href="deleteproduct/{{items.id}}">delete</a></th>


</tr>
</table>

 </div>
</body>
</html>