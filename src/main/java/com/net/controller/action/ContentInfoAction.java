package com.net.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.ContentDAO;
import com.net.dto.ContentVO;

public class ContentInfoAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ContentVO> list = ContentDAO.getInstance().getAllContent();
		
		request.setAttribute("contentList", list);
		request.getRequestDispatcher("admin/ContentInfo.jsp").forward(request, response);
		
	}

}
