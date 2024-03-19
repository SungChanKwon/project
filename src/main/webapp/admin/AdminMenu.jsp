<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="link">
		<input type="button"  value="회원관리"  onclick="location.href='NetServlet?command=member_info'">
		<input type="button" value="컨텐츠 관리"  onclick="location.href='NetServlet?command=content_info'">
		<input type="button" value="게시글 삭제"  onclick="location.href='NetServlet?command=delete_bulletin_form'">
		<input type="button" name="qna" value="Q&A"  onclick="location.href='#'">
	</div>
</body>
</html>