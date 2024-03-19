package com.net.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.BulletinDAO;
import com.net.dto.BulletinVO;

public class BulletinDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int bulletinNum = Integer.parseInt(request.getParameter("bulletinNum"));
		
		BulletinVO vo = BulletinDAO.getInstance().getOneBulletin(bulletinNum);
		
		request.setAttribute("bulletin", vo);
		request.getRequestDispatcher("admin/BulletinDetail.jsp").forward(request, response);
	}

}
