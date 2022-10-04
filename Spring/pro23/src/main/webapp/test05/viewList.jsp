<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.onload = function(){
// 		checkedAll();
		checkSelectAll();
		selectAll();
	}

// 	function checkedAll(){
// 		let a = document.querySelector('.all');
// 		a.addEventListener('change', function(){
			
// 			let b = document.querySelectorAll('.sub');
// 			for(let i=0; i<b.length; i++){
// 				b[i].checked = a.checked
// 			}
// 		});
// 	}

	function checkSelectAll(checkbox)  {
	  const selectall 
	    = document.querySelector('input[name="selectall"]');
	  
	  if(checkbox.checked === false)  {
	    selectall.checked = false;
	  }
	}
	
	function selectAll(selectAll)  {
	  const checkboxes 
	     = document.getElementsByName('check');
	  
	  checkboxes.forEach((checkbox) => {
	    checkbox.checked = selectAll.checked
	  })
	}
</script>

</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/memTest?action=delCheck">
	
	<table>
		<tr>
			<td><input type='checkbox' class="all" name='selectall' value='selectall' onclick='selectAll(this)'></td>
			<td>이름</td>
			<td>상세보기</td>
			<td>삭제</td>			
		</tr>
		
	<c:forEach var="m" items="${memList}" >			
		<tr>
			<td><input type="checkbox" name="check" value="${m.id }" class="sub" onclick='checkSelectAll(this)'></td>
			<td>${m.name }</td>
			<td><a href="${contextPath}/memTest?action=detailMem&id=${m.id }">상세보기</a></td>
			<td><a href="${contextPath}/memTest?action=deleteMem&id=${m.id }">삭제</a></td>
		</tr>
	</c:forEach>			
	</table>
	<input type="submit" value="선택삭제">
	
</form>
</body>
</html>