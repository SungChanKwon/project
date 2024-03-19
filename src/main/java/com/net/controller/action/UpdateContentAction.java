package com.net.controller.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.net.dao.ContentDAO;
import com.net.dto.ContentVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class UpdateContentAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		ServletContext context = request.getSession().getServletContext();
		String path = context.getRealPath("images");
		String enctype = "utf-8";
		int sizeLimit = 10*1024*1024;
		
		MultipartRequest multi = new MultipartRequest(request, path, sizeLimit,enctype, new DefaultFileRenamePolicy());
		
		ContentVO vo = new ContentVO();
		
		vo.setContentNum(Integer.parseInt(multi.getParameter("contentNum")));
		vo.setContentName(multi.getParameter("contentName"));
		vo.setGenre(multi.getParameter("genre"));
		vo.setActor(multi.getParameter("actor"));
		vo.setYear(Integer.parseInt(multi.getParameter("year")));
		vo.setStory(multi.getParameter("story"));
		vo.setPoster(multi.getParameter("poster"));
		
		ContentDAO.getInstance().updateContent(vo);
		request.setAttribute("content", vo);
		response.sendRedirect("NetServlet?command=content_info");
		
	}

}
