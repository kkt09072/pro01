package org.gasan.dto;

public class TrafficVO {
	private int tno;
	private String tytpe;
	private String no;
	public TrafficVO() {}
	public TrafficVO(int tno, String tytpe, String no) {
		super();
		this.tno = tno;
		this.tytpe = tytpe;
		this.no = no;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTytpe() {
		return tytpe;
	}
	public void setTytpe(String tytpe) {
		this.tytpe = tytpe;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}
