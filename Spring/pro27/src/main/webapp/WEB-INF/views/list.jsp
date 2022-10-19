<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<thead>
	<tr>
		<td>id</td>
		<td>pwd</td>
		<td>name</td>
		<td>email</td>
		<td>joinDate</td>
	</tr>
</thead>		
<tbody>
	<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.id }</td>
		<td>${dto.pwd }</td>
		<td>${dto.name }</td>
		<td>${dto.email }</td>
<%-- 		<td>${dto.joinDate }</td> --%>
		<td>
			<fmt:formatDate value="${dto.joinDate }" pattern="YYYY-MM-dd" />
		</td>
	</tr>
	</c:forEach>
</tbody>
</table>
</body>
</html>