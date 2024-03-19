package com.net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.net.dto.memberVO;

import util.DBManager;

public class MemberDAO {

	private static MemberDAO instance = new MemberDAO();
	
	private MemberDAO() {}
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public List<memberVO> getAllMember(){
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member order by userId desc";
		
		List<memberVO> list = new ArrayList<memberVO>();
		
		try {
			
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				memberVO vo = new memberVO();
				
				vo.setAdmin(rs.getInt("admin"));
				vo.setName(rs.getString("name"));
				vo.setUserId(rs.getString("userId"));
				vo.setPwd(rs.getString("pwd"));
				vo.setEmail(rs.getString("email"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				
				list.add(vo);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		
		return list;
		
	}
	
	public memberVO getOneMember(int userId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where userId = ?";
		
		memberVO vo = new memberVO();
		
		try {
			
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				vo.setAdmin(rs.getInt("admin"));
				vo.setName(rs.getString("name"));
				vo.setUserId(rs.getString("userId"));
				vo.setPwd(rs.getString("pwd"));
				vo.setEmail(rs.getString("email"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		
		return vo;
	}

	
	public void deleteMember(int userId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
String sql = "delete from member where userNum = ?";
		
		
		try {
			
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, pstmt);
		}
		
		

		
	}
}
