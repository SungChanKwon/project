package com.ott.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ott.dao.MemberDAO;
import com.ott.dto.MemberVO;

public class UpdateMemberAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		MemberVO vo = new MemberVO();
		String name = request.getParameter("name");
		String url = "project/Information.jsp";
		
		System.out.println("name>>" + name);
		String address1 = request.getParameter("address");
		String address2 = request.getParameter("detailAddress");
		String FullAddress = address1 + "." + address2;
		System.out.println("주소"+FullAddress);
	vo.setName(name);
	vo.setUserId(request.getParameter("userId"));
	vo.setEmail(request.getParameter("email"));
	vo.setPhone(request.getParameter("phone"));
	vo.setAddress(FullAddress);
	
	int result = MemberDAO.getInstance().updateMember(vo);
	
	System.out.println("result>>" + result);
	
	if(result == 1) {
	session.setAttribute("Member", vo);
	request.setAttribute("message", "수정이 완료되었습니다.");
	url = "project/MyPage.jsp";
	
	}else if(result == -1) {
		request.setAttribute("message", "수정 실패");
	}
	request.getRequestDispatcher(url).forward(request, response);
	}

}
