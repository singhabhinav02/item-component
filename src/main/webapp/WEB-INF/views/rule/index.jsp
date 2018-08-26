<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rules</title>
<link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
	<h2>List of Rules</h2>
	<table class="table table-bordered">
		<tr>
			<th>S.No</th>
			<th>Rule Name</th>
			<th>Configuration</th>

			<th>Action</th>
		</tr>
		<tbody>
			<c:forEach items="${rules}" var="rule" varStatus="itr">
				<tr>
					<td>${itr.index+1}</td>
					<td>${rule.ruleName}</td>
					<td>${rule.configuration}</td>

					<td><a href="/rule/edit/${rule.ruleId}"
						class="btn btn-warning">Edit</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<a href="/rule/create" class="btn btn-success">Add Rule</a>

	<script type="application/javascript" src="js/jquery.js"></script>
	<script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>