<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	//DB연결 정상 작동하는지 확인
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		
		out.println("conn: " + conn);
		out.println("DB연결 성공");
	%>
	
	<h1>1</h1>
	
	<h2>2</h2>
	
	<h3>3</h3>
	
	<h4>4</h4>
	
	<h5>5</h5>
	
	<h6>6</h6>
</body>
</html>