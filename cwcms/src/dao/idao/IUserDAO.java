package com.cwcms.dao.idao;

import java.util.List;

import com.cwcms.model.User;

public interface IUserDAO {
	/**
	 * 添加一个用户
	 * @param use	添加的用户对象
	 */
	public void insert(User use);
	/**
	 * 更新一个用户
	 * @param use  待更新的用户对象
	 */
	public void update(User use);
	/**
	 * 删除一个用户
	 * @param ID	待删除用户的ID
	 */
	public void delete(int ID);
	/**
	 * 查询用户信息
	 * @param condt	查询限制条件
	 * @return	查询结果
	 */
	public List<User> select(String condt);
	
	/**
	 * 通过用户名查询用户
	 * @param username  用户名
	 * @return 用户信息
	 */
	public User selectUserByUsername(String username);
}
