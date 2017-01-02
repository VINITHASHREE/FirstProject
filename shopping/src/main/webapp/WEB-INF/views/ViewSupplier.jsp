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
	app.controller("SupplierController",function($scope,$http){
		$scope.getdata = function(){
			$http({
				method : 'GET',
				url : 'viewsupplierlist'
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
<div ng-app="myApp" ng-controller="SupplierController" ng-init="getdata()">
<table>
<tr>
<th>sid</th>
<th>sn</th>
<th>em</th>
<th>addr</th>
<th>mn</th>
</tr>
<tr ng-repeat="items in result">
<th>{{items.sid}}</th>
<th>{{items.sn}}</th>
<th>{{items.em}}</th>
<th>{{items.addr}}</th>
<th>{{items.mn}}</th>
<th><a href="editsupplier/{{items.sid}}">edit</a></th>
<th><a href="deletesupplier/{{items.sid}}">delete</a></th>
</tr>
</table>

 </div>
</body>
</html>