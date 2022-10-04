<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form method="post" action="${pageContext.request.contextPath}/memTest?action=viewList">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>${dmem.id }</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>${dmem.pwd }</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${dmem.name }</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${dmem.email }</td>
			</tr>
			<tr>
				<td>가입날짜</td>			
				<td>${dmem.joinDate }</td>
			</tr>

		</table>
		
		<input type="submit" value="목록가기">
		</form>
		<a href="${pageContext.request.contextPath}/memTest?action=goUpdateMem&id=${dmem.id }">수정 바로가기</a>
</body>
</html>