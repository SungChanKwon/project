<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/Ott.css">
</head>
<body>
	<div id="wrap" align="center">
      <h1>게시글 수정</h1>
      <form name="frm" method="post" action="OttServlet">
         <input type="hidden" name="command" value="bulletin_update"> <input
            type="hidden" name="bulletinNum" value="${bulletin.bulletinNum}">
            <input type="hidden" name="contentNum" value="${bulletin.contentNum}">
         <table>
            <tr>
               <th>작성자</th>
               <td><input type="text" size="12" class="id-input"name="name"
                  value="${bulletin.name}" readonly style="border:none;"></td>
            </tr>
            <tr>
               <th>아이디</th>
               <td><input class="id-input" type="text" name="userId" value="${member.userId}" readonly style="border:none;"></td>
            </tr>
            <tr>
               <th>제목</th>
               <td><input type="text" size="70" name="bulletinTitle"
                  value="${bulletin.bulletinTitle}"></td>
            </tr>
            <tr>
               <th>내용</th>
               <td><textarea cols="70" rows="15" name="bulletinContent">${bulletin.bulletinContent}</textarea></td>
            </tr>
         </table>
         <br>
         <br> <input type="submit" value="수정" name= "update" onclick="if(!confirm('수정하시겠습니까?')){return false;}">
              <input type="reset" value="다시 작성">
              <input type="button" value="목록"
            			onclick="location.href='OttServlet?command=admin_content_detail&contentNum=${bulletin.contentNum}'">
      </form>
   </div>
</body>
</html>