package com.ott.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.ott.dto.BulletionVO;

public class BulletinDAO {

	private static BulletinDAO instance = new BulletinDAO();
	
	public BulletinDAO() {}
	
	private static BulletinDAO getInstance() {
		return instance;
	}
	
	private static Connection getConnection() {
		Connection conn = null;
		try {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//select
	private void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//update, delete
	private void close(Connection con, Statement stmt) {
		try {
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertBulletin(BulletionVO bVo) {
		
	}
	
	public void updateBulletin(BulletionVO bVo) {
		
	}
	
	public void deleteBulletin(int BulletinNum) {
		
	}
	
	public List<BulletionVO> getAllBulletin() {
		return list;
	}
	
	public BulletionVO selectBulletinTitle(int BulletinNum) {
		
	}
	
	public void updateReadCount(int BulletinNum) {
		
	}
}
