package com.ott.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ott.dao.MemberDAO;
import com.ott.dto.MemberVO;

public class ChangeUserInformationFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String id = (String) session.getAttribute("userid");
		System.out.println("id>>" + id);
		MemberVO vo = MemberDAO.getInstance().getOneMember(id);
		
		request.setAttribute("Member", vo);
		System.out.println("vo>>" + vo);
		request.getRequestDispatcher("project/Information.jsp")
		.forward(request, response);

		
		

	}

}
