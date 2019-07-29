package com.cwcms.model;

public class Studio {

	private int id=0      ; 
	private String name="" ;
	private int rowCount=0;
	private int colCount=0;
	private String introduction=""; //介绍
	public Studio() {
	}
	public Studio(String name, int rowCount, int colCount, String introduction) {
		super();
		this.name = name;
		this.rowCount = rowCount;
		this.colCount = colCount;
		this.introduction = introduction;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getColCount() {
		return colCount;
	}
	public void setColCount(int colCount) {
		this.colCount = colCount;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String toString() {
		return "Studio [id=" + id + ", name=" + name + ", rowCount=" + rowCount + ", colCount=" + colCount
				+ ", introduction=" + introduction + "]";
	}
	
}
