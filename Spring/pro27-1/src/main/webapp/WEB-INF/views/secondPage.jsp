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
		<td>EMPNO</td>
		<td>ENAME</td>
		<td>JOB</td>
		<td>MGR</td>
		<td>HIREDATE</td>
		<td>SAL</td>
		<td>COMM</td>
		<td>DEPTNO</td>
	</tr>
</thead>
<tbody>
	<c:forEach var="dto" items="${dto }" >
	<tr>
		<td>${dto.empno }</td>
		<td>${dto.ename }</td>
		<td>${dto.job }</td>
		<td>${dto.MGR }</td>
		<td> <fmt:formatDate value="${dto.hireDate }" pattern="YYYY-MM-dd" /> </td>
		<td>${dto.sal }</td>
		<td>${dto.comm }</td>
		<td>${dto.deptno }</td>
	</tr>
	</c:forEach>
</tbody>
</table>
</body>
</html>