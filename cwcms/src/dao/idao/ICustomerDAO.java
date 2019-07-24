package com.cwcms.dao.idao;

import java.util.List;

import com.cwcms.model.Customer;

public interface ICustomerDAO {
	
	/**
	 * 插入一条客户信息
	 * @param cus	待插入的客户对象
	 */
	public void insert(Customer cus);
	/**
	 * 更新一条客户信息
	 * @param cus	待更新的客户对象
	 */
	public void update(Customer cus);
	/**
	 * 删除一条客户信息
	 * @param ID	待删除客户信息ID
	 */
	public void delete(int ID);
	/**
	 * 查询客户信息
	 * @param condt	查询限制条件
	 * @return	查询结果
	 */
	public List<Customer> selete(String condt);
}
