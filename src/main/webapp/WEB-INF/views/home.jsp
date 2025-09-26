<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %> 
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<title><c:out value="${page}"></c:out></title>
</head>
<body>
	<div class="container mt-3">
		<h1 class="text-center">Welcome to TODO Manager</h1>
		<c:if test="${not empty msg}">
		<div class="alert alert-success">
		   <b><c:out value="${msg}"></c:out></b>  
		</div>
		
	
		</c:if>
		
		<div class="row mt-4">
			<div class="col-md-2">
				<div class="list-group">
					<button type="button"
						class="list-group-item list-group-item-action active"
						aria-current="true">Menu</button>
					 <a href='<c:url value='/add'></c:url>'
						class="list-group-item list-group-item-action">Add TODO</a>
					 <a href='<c:url value='/home'></c:url>'
						class="list-group-item list-group-item-action">View Todo</a>
				</div>
			</div>
			<div class="col-md-10">
			        <c:if test="${page=='home'}">
				<h1 class="">All TODOS</h1>
				<c:forEach items="${todos}" var="t">
				 <div class="card">
				    <div class="card-body">
				    <h3>
				       <c:out value="${t.todoTitle}"></c:out>
				    </h3>
				    <p>
				     <c:out value="${t.todoContent}"></c:out>
				    </p>			    
				    </div> 
				 </div>				
				</c:forEach>				
				</c:if>
				   <c:if test="${page=='add'}">
				<h1 class="">ADD TODO</h1>
				<br>
				<form:form action="saveTodo" method="post" modelAttribute="todo">
				   <div class="form-group">
				       <form:input path="todoTitle" cssClass="form-control" placeholder="Enter the todo title"></form:input>
				   </div>
				   <div class="form-group">
				       <form:textarea path="todoContent" cssClass="form-control" placeholder="Enter the todo content" 
				       cssStyle="height:300px;" /> 
				   </div>
				   <div class="container text-center">
				   <button class="btn btn-primary">ADD TODO</button> 
				<!--   <button class="btn btn-primary">ADD TODO</button> --> 
				   </div>
				</form:form>
				</c:if>
			</div>
		</div>
	</div>
</body>
</html>
