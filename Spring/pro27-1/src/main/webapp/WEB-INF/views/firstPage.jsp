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
<style>
	div{
		margin: 10px 0;
	}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	window.onload=function(){
		checkAll();
		changeAll();
	}
	
	function checkAll(){
		let all = document.querySelector(".all");
		let checkList = document.querySelectorAll(".part");
		
		all.addEventListener("change", function(e){
			for(let i=0; i< checkList.length; i++){
				checkList[i].checked = e.target.checked;
			}
		})
	}
	
	function changeAll(){
		let all = document.querySelector(".all");
		let checkboxList = document.querySelectorAll(".part");
		
		for(let i=0; i< checkboxList.length; i++){
			checkboxList[i].addEventListener("change", function(){
				
				let checkboxList = document.querySelectorAll(".part");
				let checkedList = document.querySelectorAll(".part:checked");
				if(checkboxList.length == checkedList.length){
					all.checked = true;
				} else{
					all.checked = false;
				}
			})
		}
	}
	
	
	
</script>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/member/listDnos">
<div><input type="text" name="deptno"> <input type="submit" class="searchDept" value="부서조회"></div>
</form>

<form method="post" action="${pageContext.request.contextPath}/member/listSals">
<div>
	<input style="width:69px;" type="text" name="salMin"> ~
	<input style="width:69px;" type="text" name="salMax">
	<input type="submit" class="searchSal" value="급여조회">
</div>
</form>

<form method="post" action="${pageContext.request.contextPath}/member/listEns">
<div><input type="text" name="ename"> <input type="submit" class="searchName" value="이름조회"></div>
</form>

<!-- <div> -->
<!-- 	<select name="select"> -->
<!-- 		<option value="deptNo">부서</option> -->
<!-- 		<option value="sal">급여</option> -->
<!-- 	</select> -->
<!-- 	<input style="width:69px;" type="text" name="selMin"> ~ -->
<!-- 	<input style="width:69px;" type="text" name="selMax"> -->
<!-- 	<input type="button" class="searchSelect"  value="조회"> -->
<!-- </div> -->

<form >
<div>
	<input type="submit" value="선택한 회원만 보기" />
</div>

<!-- <div> -->
<!-- 	<input type="checkbox" value="accounting" name="accounting" class=""> accounting</input> -->
<!-- 	<input type="checkbox" value="research" name="research" > research</input> -->
<!-- 	<input type="checkbox" value="sales" name="sales" > sales</input> -->
<!-- </div> -->

<table border=1>
<thead>
	<tr>
		<td> <input type="checkbox" class="all" /> </td>
		<td>DEPTNO</td>
		<td>DNAME</td>
		<td>EMPNO</td>
		<td>ENAME</td>
		<td>SAL</td>
	</tr>
</thead>
<tbody>
	<c:forEach var="dto" items="${dto }" >
	<tr>
		<td> <input type="checkbox" class="part" id="chk_${dto.empno }" value="${dto.empno }" name="chk" /> </td>
		<td>${dto.deptno }</td>
		<td>${dto.dname }</td>
		<td>${dto.empno }</td>
		<td>${dto.ename }</td>
		<td>${dto.sal }</td>
	</tr>
	</c:forEach>
</tbody>
</table>
</form>

</body>
</html>