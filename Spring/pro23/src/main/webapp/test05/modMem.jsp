<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/memTest?action=updateMem&id=${umem.id }">
		<table border="1">
			
			<tr>
				<td>아이디</td>
				<td>${umem.id }</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pwd" value="${umem.pwd }"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${umem.name }"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value="${umem.email }"></td>
			</tr>
			<tr>
				<td>가입날짜</td>			
				<td>${umem.joinDate }</td>
			</tr>
		</table>
		<input type="submit" value="수정하기">
	</form>
</body>
</html>