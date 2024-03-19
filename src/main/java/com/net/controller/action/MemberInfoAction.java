package com.net.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.MemberDAO;
import com.net.dto.memberVO;

public class MemberInfoAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<memberVO> list = MemberDAO.getInstance().getAllMember();
		
		request.setAttribute("memberList", list);
		
		request.getRequestDispatcher("admin/MemberInfo.jsp").forward(request, response);
	}

}
