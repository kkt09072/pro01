package org.gasan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.gasan.dto.Qna;

public class QnaDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Qna> getLatestQnaList(){
		List<Qna> qList = new ArrayList<>();
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(OracleDB.LATEST_QNA);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Qna q = new Qna(rs.getInt("no"),
						rs.getInt("plevel"),
						rs.getInt("parno"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("resdate"),
						rs.getInt("visited"),
						rs.getString("aid"));
				qList.add(q);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		return qList;
	}
	
	public List<Qna> getQnaList(){
		List<Qna> qList = new ArrayList<>();
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.SELECT_ALL_QNA);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Qna q = new Qna(rs.getInt("no"),
						rs.getInt("plevel"),
						rs.getInt("parno"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("resdate"),
						rs.getInt("visited"),
						rs.getString("aid"));
				qList.add(q);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		return qList;
	}
	
	public Qna getQna(int no) {
		Qna q = new Qna();
		OracleDB oracle = new OracleDB();
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.VISITED_UPD_QNA);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			pstmt = null;
			pstmt = con.prepareStatement(SqlLang.SELECT_QNA_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				q.setNo(rs.getInt("no"));
				q.setPlevel(rs.getInt("plevel"));
				q.setParno(rs.getInt("parno"));
				q.setTitle(rs.getString("title"));
				q.setContent(rs.getString("content"));
				q.setResdate(rs.getString("resdate"));
				q.setVisited(rs.getInt("visited"));
				q.setAid(rs.getString("aid"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		return q;
	}
	
	public int insQuestion(Qna q) {
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(OracleDB.INS_QUESTION);
			pstmt.setString(1, q.getTitle());
			pstmt.setString(2, q.getContent());
			pstmt.setString(3, q.getAid());
			cnt = pstmt.executeUpdate();
			
			pstmt = null;
			pstmt = con.prepareStatement(OracleDB.UPD_PARNO_QUESTION);
			cnt = cnt + pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}

	public int insAnswer(Qna q) {
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(OracleDB.INS_ANSWER);
			pstmt.setInt(1, q.getParno());
			pstmt.setString(2, q.getTitle());
			pstmt.setString(3, q.getContent());
			pstmt.setString(4, q.getAid());
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}
	
	public int editProQna(Qna q) {
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.UPD_QNA);
			pstmt.setString(1, q.getTitle());
			pstmt.setString(2, q.getContent());
			pstmt.setInt(3, q.getNo());
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}
	
	public int delQuestion(int parno){
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.DEL_QUESTION);
			pstmt.setInt(1, parno);
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}

	public int delAnswer(int no){
		int cnt = 0;
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.DEL_ANSWER);
			pstmt.setInt(1, no);
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt);
		}
		return cnt;
	}
	
	public Qna getQna2(int no) {
		Qna q = new Qna();
		OracleDB oracle = new OracleDB();
		
		try {
			con = oracle.connect();
			pstmt = null;
			pstmt = con.prepareStatement(SqlLang.SELECT_QNA_BYNO);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				q.setNo(rs.getInt("no"));
				q.setPlevel(rs.getInt("plevel"));
				q.setParno(rs.getInt("parno"));
				q.setTitle(rs.getString("title"));
				q.setContent(rs.getString("content"));
				q.setResdate(rs.getString("resdate"));
				q.setVisited(rs.getInt("visited"));
				q.setAid(rs.getString("aid"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		return q;
	}
}
