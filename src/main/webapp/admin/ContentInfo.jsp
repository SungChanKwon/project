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
	<a href="NetServlet?command=insert_content_form">컨텐츠 추가</a>
	<table>
		<tr>
			<th>컨텐츠 번호</th>
			<th>컨텐츠 제목</th>
			<th>장르</th>
			<th>배우</th>
			<th>개봉연도</th>
			<th>삭제</th>
		</tr>
		<c:forEach items="${contentList}" var="content">
			<tr>
				<td>${content.contentNum}</td>
				<td><a href="NetServlet?command=content_detail&contentNum=${content.contentNum}">${content.contentName}</a></td>
				<td>${content.genre}</td>
				<td>${content.actor}</td>
				<td>${content.year}</td>
				<td><a href="NetServlet?command=delete_content&contentNum=${content.contentNum}">컨텐츠 삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="홈으로" onclick="location.href='NetServlet?command=admin_menu'">
</body>
</html>