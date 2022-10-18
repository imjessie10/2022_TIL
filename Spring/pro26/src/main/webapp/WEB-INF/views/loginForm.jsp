<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> uri : ${uri }</h1>
>>926p
<h3>post</h3>
<form method="post"  action="/pro26/test/login.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	<input type="submit" value="로그인">
</form>
<hr>
<h3>get</h3>
<form method="get"  action="/pro26/test/login.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	<input type="submit" value="로그인">
</form>

<hr>
<h3>method 안쓰면?</h3>
>>get
<form method="get"  action="/pro26/test/login0.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	<input type="submit" value="로그인">
</form>
>>post
<form method="post"  action="/pro26/test/login0.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	<input type="submit" value="로그인">
</form>
	
<hr>

>>928p
<h3>login2.do</h3>
<form method="get"  action="/pro26/test/login2.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	<input type="submit" value="로그인">
</form>
>>930p
<h3>login2.do + email</h3>
<form method="get"  action="/pro26/test/login2.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	이메일 <input type="text" name="email">
	<input type="submit" value="로그인">
</form>

<hr>
<h3>Map</h3>
>>932p
<form method="get"  action="/pro26/test/login3.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	<input type="submit" value="로그인">
</form>

<hr>
>>933p
<form method="get"  action="/pro26/test/login4.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	이메일 <input type="text" name="email">
	<input type="submit" value="로그인">
</form>

<hr>
<h3>모델</h3>
>>93p
<form method="get"  action="/pro26/test/login5.do">
	아이디 <input type="text" name="userID">
	이름 <input type="text" name="userName">
	이메일 <input type="text" name="email">
	<input type="submit" value="로그인">
</form>
</body>
</html>