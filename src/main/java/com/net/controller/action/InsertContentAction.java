package com.net.controller.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class InsertContentAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		ServletContext context = request.getSession().getServletContext();
		String path = context.getRealPath("images");
		String enctype = "UTF-8";
		int sizeLimit = 10*1024*1024;
		
		System.out.println(request.toString());
		
		MultipartRequest multi = new MultipartRequest(request, path, sizeLimit,enctype, new DefaultFileRenamePolicy());
		
	}

}
