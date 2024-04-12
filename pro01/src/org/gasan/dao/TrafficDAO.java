package org.gasan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.gasan.dto.Traffic;
import org.gasan.dto.TrafficVO;

public class TrafficDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<Traffic> getTrafficList(){
		List<Traffic> tList = new ArrayList<>();
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.SELECT_ALL_TRAFFIC);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Traffic t = new Traffic(rs.getInt("tno"),
						rs.getString("ttype"),
						rs.getString("no"),
						rs.getString("route"),
						rs.getString("coment"),
						rs.getString("uri"));
				tList.add(t);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		return tList;
	}
	
	public List<TrafficVO> getTab(){
		List<TrafficVO> voList = new ArrayList<>();
		OracleDB oracle = new OracleDB();
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(SqlLang.SELECT_ALL_TRAFFIC);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				TrafficVO t = new TrafficVO(rs.getInt("tno"),
						rs.getString("ttype"),
						rs.getString("no"));
				voList.add(t);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			oracle.close(con, pstmt, rs);
		}
		return voList;
	}
}
