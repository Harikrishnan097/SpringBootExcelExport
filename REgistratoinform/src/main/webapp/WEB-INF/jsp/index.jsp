<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>

<script type="text/javascript" src="/WEB-INF/js/apsub.js"></script>
<form action="/reg" method="post">

<select name="application" id="application" onchange="setSubapp()">
<option selected="" value="-1" disabled="">Select app</option>
<option value="CCBAT">Batc</option>
<option value="ccser">ser</option>
</select>

<select name="subapp" id="subapp" >
<option selected="" value="-1" disabled="">Select subapp</option>
<option value="">select</option>
</select>


<button  type="submit">submit</button>
</form>
</body>
</html>