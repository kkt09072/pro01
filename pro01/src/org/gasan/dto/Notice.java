package org.gasan.dto;

public class Notice {
	private int no;
	private String title;
	private String content;
	private String resdate;
	private int visited;
	public Notice() { }
	public Notice(int no, String title, String content, String resdate, int visited) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.resdate = resdate;
		this.visited = visited;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "Notice [no=" + no + ", title=" + title + ", content=" + content + ", resdate=" + resdate + ", visited="
				+ visited + "]";
	}
	 
}
