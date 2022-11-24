<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="/test/resources/js/plugin/jquery-3.6.1.js"></script>
	<script src="/test/resources/js/home.js"></script>
</head>
<body>
	<table>
		<thead>
			<th>empno</th>
			<th>ename</th>
			<th>sal</th>
			<th>job</th>
			<th>mgr</th>
		</thead>
		<tbody id="emp_tbody"></tbody>
	</table>
</body>
</html>
