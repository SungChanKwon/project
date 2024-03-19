<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>게시글 번호</th>
			<th>게시글 제목</th>
			<th>이름</th>
			<th>아이디</th>
			<th>개시일자</th>
		</tr>
		<c:forEach items="${bulletinList}" var="bulletin">
			<tr>
				<td>${bulletin.bulletinNum}</td>
				<td><a
					href="NetServlet?command=bulletin_detail&bulletinNum=${bulletin.bulletinNum}">${bulletin.bulletinTitle}</a></td>
				<td>${bulletin.name}</td>
				<td>${bulletin.userId}</td>
				<td>${bulletin.bulletinDate}</td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="홈으로" onclick="location.href='NetServlet?command=admin_menu'">
</body>
</html>