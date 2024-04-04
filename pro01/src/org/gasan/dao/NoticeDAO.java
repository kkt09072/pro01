package org.gasan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.gasan.dto.Notice;

public class NoticeDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Notice> getNoticeList(){
		List<Notice> notiList = new ArrayList<>();
		
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.Connect();
			try {
				pstmt = con.prepareStatement(SqlLang.SELECT_ALL_NOTICE);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Notice noti = new Notice(rs.getInt("no"),
							rs.getString("title"),
							rs.getString("content"),
							rs.getString("resdate"),
							rs.getInt("visited"));
					notiList.add(noti);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		return notiList;
	}
}