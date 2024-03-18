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
			<th>컨텐츠 번호</th>
			<th>컨텐츠 제목</th>
			<th>장르</th>
			<th>배우</th>
			<th>개봉연도</th>
		</tr>
		<c:forEach items="${contentList}" var="content">
			<tr>
				<td>${content.contentNum}</td>
				<td>${content.contentName}</td>
				<td>${content.genre}</td>
				<td>${content.actor}</td>
				<td>${content.year}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>