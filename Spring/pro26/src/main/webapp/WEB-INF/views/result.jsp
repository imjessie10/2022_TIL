<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg }</h1>
	<h1>아이디 : ${userID }</h1>
	<h1>이름   : ${userName }</h1>
	<h1>
	<c:if test="${empty email }">
		이메일이 없습니다.
	</c:if>
	<c:if test="${!(empty email) }"></c:if>
		이메일 : ${email }
	</h1>
	
	<hr>
	>>map test, model test
	<h1>
	info.userID : ${info.userID }<br>
	info.userName : ${info.userName }<br>
	info.email : ${info.email }
	</h1>
</body>
</html>