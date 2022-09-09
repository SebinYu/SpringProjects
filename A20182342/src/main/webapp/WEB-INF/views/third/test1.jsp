<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>   
<table>
	<thead>
		<tr>
			<th>id</th>
			<th>학번</th>
			<th>이름</th>
			<th>이메일</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>${ student1.id}</td>
			<td>${ student1.studentNumber }</td>
			<td>${ student1.studentName }</td>
			<td>${ student1.email }</td>
		</tr>
	</tbody>
</table>

</body>
</html>