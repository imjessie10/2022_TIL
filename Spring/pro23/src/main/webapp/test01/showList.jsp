<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>name테스트</h3>
이름 : ${nameTest }

<br>
<h3>pwd테스트</h3>
비밀번호 : ${pwdTest }

<br>
<h3>HashMap테스트</h3>
<table>
 <c:forEach var="m" items="${list}" >     
   <tr align="center">
      <td>${m.id}</td>
      <td>${m.pwd}</td>
      <td>${m.name}</td>
      <td>${m.email}</td>
      <td>${m.joinDate}</td>      
    </tr>
  </c:forEach>   
</table>

<hr>
<h3>마이바티스로 조회</h3>
<table border="1"  align="center">
    <tr align="center"   bgcolor="lightgray">
      <td ><b>아이디</b></td>
      <td><b>비밀번호</b></td>
      <td><b>이름</b></td>
      <td><b>이메일</b></td>
      <td><b>가입일</b></td>
   </tr>
   
 <c:forEach var="m" items="${memList}" >     
   <tr align="center">
      <td>${m.id}</td>
      <td>${m.pwd}</td>
      <td>${m.name}</td>
      <td>${m.email}</td>
      <td>${m.joinDate}</td>      
    </tr>
  </c:forEach>   
</table>

</body>
</html>