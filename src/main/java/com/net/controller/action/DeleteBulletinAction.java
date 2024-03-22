package com.net.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.BulletinDAO;

public class DeleteBulletinAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bulletinNum = Integer.parseInt(request.getParameter("bulletinNum"));
		
		BulletinDAO.getInstance().deleteBulletin(bulletinNum);
		
		response.sendRedirect("OttServlet?command=delete_bulletin_form");
		
	}

}
