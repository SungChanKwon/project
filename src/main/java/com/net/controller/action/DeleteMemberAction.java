package com.net.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.MemberDAO;
import com.net.dto.memberVO;

public class DeleteMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		MemberDAO.getInstance().deleteMember(userId);
		
		response.sendRedirect("NetServlet?command=member_info");
		
	}

}
