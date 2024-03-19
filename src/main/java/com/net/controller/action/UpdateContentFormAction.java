package com.net.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.ContentDAO;

public class UpdateContentFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int contentNum = Integer.parseInt(request.getParameter("contentNum"));
		
		ContentDAO.getInstance().getOneContent(contentNum);
		
		request.getRequestDispatcher("admin/UpdateContent.jsp").forward(request, response);
		
		
	}

}
