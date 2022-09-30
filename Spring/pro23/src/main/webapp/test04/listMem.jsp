<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<%
  request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1"  align="center">
    <tr align="center"   bgcolor="lightgray">
      <td ><b>아이디</b></td>
      <td><b>비밀번호</b></td>
      <td><b>이름</b></td>
      <td><b>이메일</b></td>
      <td><b>가입일</b></td>
      <td><b>삭제</b></td>
   </tr>
   
 <c:forEach var="m" items="${memList}" >     
   <tr align="center">
      <td>${m.id}</td>
      <td>${m.pwd}</td>
      <td>${m.name}</td>
      <td>${m.email}</td>
      <td>${m.joinDate}</td>
      <td>삭제하기</td>
    </tr>
  </c:forEach>   
</table>
</body>
</html>