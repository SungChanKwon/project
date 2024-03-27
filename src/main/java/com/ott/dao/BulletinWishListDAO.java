package com.ott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ott.controller.util.DBManager;
import com.ott.dto.BulletinVO;

public class BulletinWishListDAO {

 	private BulletinWishListDAO(){}
 	
 	private static BulletinWishListDAO instance = new BulletinWishListDAO();
 	
 	public static BulletinWishListDAO getInstace() {
 		return instance;
 	}
 	
 	public List<Integer> getBulletinNums(String userid){
 		System.out.println(userid);
 		List<Integer>list = new ArrayList<Integer>();
 		
 		Connection con = null;
 		PreparedStatement pstmt = null;
 		ResultSet rs = null;
 		String sql = "select bulletinNum from bulletinWishList where userid = ?";
 		
 		try {
 			con = DBManager.getConnection();
 			
 			pstmt = con.prepareStatement(sql);
 			
 			pstmt.setString(1, userid);
 			
 			rs = pstmt.executeQuery();
 			
 			System.out.println("rs>>!" + rs);
 			while(rs.next()) {
 				list.add(rs.getInt("bulletinNum"));
 			}
 		}catch(Exception e) {
 			e.printStackTrace();
 		}finally {
 			DBManager.close(con, pstmt, rs);
 		}
 		
 		return list;
 	}
 	
 	public List<BulletinVO> getBulletinWishList(List<Integer> list){
 		List<BulletinVO>Volist = new ArrayList<BulletinVO>();
 		
 		Connection con = null;
 		PreparedStatement pstmt = null;
 		ResultSet rs = null;
 		String sql = "select * from bulletin where bulletinNum = ?";
 		
 		try {
 			con = DBManager.getConnection();
 			
 			pstmt = con.prepareStatement(sql);
 			
 			for(int i = 0; i < list.size(); i++) {
 				
 				pstmt.setInt(1, list.get(i));
 				
 				rs = pstmt.executeQuery();
 				
 	 			if(rs.next()) {
 	 				BulletinVO vo = new BulletinVO();
 	 				
 	 				vo.setBulletinNum(rs.getInt("bulletinNum"));
 	 				vo.setBulletinTitle(rs.getString("bulletinTitle"));
 	 				vo.setBulletinDate(rs.getTimestamp("bulletinDate"));
 	 				vo.setBulletinContent(rs.getString("bulletinContent"));
 	 				vo.setReadCount(rs.getInt("readCount"));
 	 				vo.setName(rs.getString("name"));
 	 				
 	 				Volist.add(vo);
 	 				
 	 			}
 			}
 			
 			
 			

 			
 		}catch(Exception e) {
 			e.printStackTrace();
 		}finally {
 			DBManager.close(con, pstmt, rs);
 		}
 		
 		return Volist;
 	}
}
