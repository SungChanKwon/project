package com.net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.net.dto.ContentVO;

import util.DBManager;

public class ContentDAO {

	private static ContentDAO instance = new ContentDAO();

	private ContentDAO() {

	}

	public static ContentDAO getInstance() {
		return instance;
	}

	public List<ContentVO> getAllContent() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<ContentVO> list = new ArrayList<ContentVO>();

		String sql = "select * from content order by contentNum desc";

		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ContentVO vo = new ContentVO();

				vo.setContentNum(rs.getInt("contentNum"));
				vo.setContentName(rs.getString("contentName"));
				vo.setGenre(rs.getString("genre"));
				vo.setActor(rs.getString("actor"));
				vo.setYear(rs.getInt("year"));
				vo.setStory(rs.getString("story"));
				vo.setPoster(rs.getString("poster"));

				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

		return list;
	}

	public ContentVO getOneContent(int contentNum) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from content where contentNum=?";

		ContentVO vo = new ContentVO();
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, contentNum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setContentNum(rs.getInt("contentNum"));
				vo.setContentName(rs.getString("contentName"));
				vo.setGenre(rs.getString("genre"));
				vo.setActor(rs.getString("actor"));
				vo.setYear(rs.getInt("year"));
				vo.setStory(rs.getString("story"));
				vo.setPoster(rs.getString("poster"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

		return vo;
	}

	public void insertContent(ContentVO vo) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "insert into content values(content_seq.nextval,?,?,?,?,?,?)";

		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, vo.getContentName());
			pstmt.setString(2, vo.getGenre());
			pstmt.setString(3, vo.getActor());
			pstmt.setInt(4, vo.getYear());
			pstmt.setString(5, vo.getStory());
			pstmt.setString(6, vo.getPoster());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}

	}

	public void updateContent(ContentVO vo) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "update content set contentName=?, genre=?, actor=?, year=?, "
				+ "story = ?, poster=? where contentNum=?";

		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, vo.getContentName());
			pstmt.setString(2, vo.getGenre());
			pstmt.setString(3, vo.getActor());
			pstmt.setInt(4, vo.getYear());
			pstmt.setString(5, vo.getStory());
			pstmt.setString(6, vo.getPoster());
			pstmt.setInt(7, vo.getContentNum());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}

	}

	public void deleteContent(int contentNum) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "delete from content where contentNum = ?";

		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
	}


	public ContentVO selectCotentTitle(String contentName) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from content where contentTitle=?";

		ContentVO vo = new ContentVO();
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, contentName);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setContentNum(rs.getInt("contentNum"));
				vo.setContentName(rs.getString("contentName"));
				vo.setGenre(rs.getString("genre"));
				vo.setActor(rs.getString("actor"));
				vo.setYear(rs.getInt("year"));
				vo.setStory(rs.getString("story"));
				vo.setPoster(rs.getString("poster"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

		return vo;
	}

	public ContentVO selectCotentGenre(String genre) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from content where contentTitle=?";

		ContentVO vo = new ContentVO();
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, genre);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setContentNum(rs.getInt("contentNum"));
				vo.setContentName(rs.getString("contentName"));
				vo.setGenre(rs.getString("genre"));
				vo.setActor(rs.getString("actor"));
				vo.setYear(rs.getInt("year"));
				vo.setStory(rs.getString("story"));
				vo.setPoster(rs.getString("poster"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

		return vo;
	}

	public ContentVO selectCotentActor(String actor) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from content where contentTitle=?";

		ContentVO vo = new ContentVO();
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, actor);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setContentNum(rs.getInt("contentNum"));
				vo.setContentName(rs.getString("contentName"));
				vo.setGenre(rs.getString("genre"));
				vo.setActor(rs.getString("actor"));
				vo.setYear(rs.getInt("year"));
				vo.setStory(rs.getString("story"));
				vo.setPoster(rs.getString("poster"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

		return vo;
	}

}
