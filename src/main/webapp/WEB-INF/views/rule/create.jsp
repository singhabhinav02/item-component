<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Rule</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
<h2>Create new Rule</h2>
<form action="/rule/save" method="post">
    <table class="table table-bordered">
        <tbody>
            <tr><th>Rule Name</th><td><input type="text" name="ruleName" required="required"></td></tr>   
             <tr><th>Configuration</th><td> <textarea rows="4" cols="50"  name="configuration" required="required">
Enter comma separated keys and values as key1=value1, key2=value2
</textarea> </td></tr>            
            <tr><td colspan="2"><input type="submit" value="Add Rule" class="btn btn-success"></tr>
        </tbody>
    </table>
</form>
<a href="/rule/index" class="btn btn-success">Back</a>

<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>