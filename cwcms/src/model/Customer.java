package com.cwcms.model;

public class Customer {
	private int 	customer_id=0;		//客户ID
	private String 	customer_name="";	//客户姓名
	private String 	customer_sex="";	//客户性别
	private int 	customer_bill=0;	//账户余额
	private String 	customer_tell="";	//客户电话
	private String customer_descp="";	//客户简介
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_sex() {
		return customer_sex;
	}
	public void setCustomer_sex(String customer_sex) {
		this.customer_sex = customer_sex;
	}
	public int getCustomer_bill() {
		return customer_bill;
	}
	public void setCustomer_bill(int customer_bill) {
		this.customer_bill = customer_bill;
	}
	public String getCustomer_tell() {
		return customer_tell;
	}
	public void setCustomer_tell(String customer_tell) {
		this.customer_tell = customer_tell;
	}
	public String getCustomer_descp() {
		return customer_descp;
	}
	public void setCustomer_descp(String customer_descp) {
		this.customer_descp = customer_descp;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_sex="
				+ customer_sex + ", customer_bill=" + customer_bill + ", customer_tell=" + customer_tell
				+ ", customer_descp=" + customer_descp + "]";
	}
	
}
