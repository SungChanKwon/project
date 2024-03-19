package com.net.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.BulletinDAO;
import com.net.dto.BulletinVO;

public class DeleteBulletinFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<BulletinVO> list = BulletinDAO.getInstance().getAllBulletin();
		
		request.setAttribute("bulletinList", list);
		
		request.getRequestDispatcher("admin/DeleteBulletin.jsp").forward(request, response);
		
	}

}
