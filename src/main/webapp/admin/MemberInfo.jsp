<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th>
			<th>권한</th>
			<th>이름</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>삭제</th>
		</tr>
		<c:forEach items="${memberList}" var="member">
			<tr>
				<td>${member.userId}</td>
				<td>${member.admin}</td>
				<td>${member.name}</td>
				<td>${member.email}</td>
				<td>${member.phone}</td>
				<td>${member.address}</td>	
				<td><a href="NetServlet?command=delete_member&userId=${member.userId}">회원 삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="홈으로" onclick="location.href='NetServlet?command=admin_menu'">
</body>
</html>