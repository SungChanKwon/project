package com.net.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.ContentDAO;
import com.net.dto.ContentVO;

public class ContentDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int contentNum = Integer.parseInt(request.getParameter("contentNum"));
		System.out.println(contentNum);
		
		ContentVO vo =  ContentDAO.getInstance().getOneContent(contentNum);
		
		request.setAttribute("content", vo);
		request.getRequestDispatcher("admin/ContentDetail.jsp").forward(request, response);
	}

}
