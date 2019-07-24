package com.cwcms.dao.idao;

import java.util.List;

import com.cwcms.model.Studio;

/**
 * 
 * @author Tian
 *
 */
public interface IStudioDAO {

	/**
	 * 添加一条演出厅的信息
	 * 
	 * @param stu
	 *            演出厅对象
	 */
	public void insert(Studio stu);

	/**
	 * 更新某演出厅的信息
	 * 
	 * @param stu
	 *            新的演出厅信息
	 */
	public void update(Studio stu);

	/**
	 * 删除演出厅
	 * 
	 * @param ID
	 *            需要删除的演出厅ID
	 */
	public void delete(int ID);

	/**
	 * 查询演出厅的信息
	 * 
	 * @param condt
	 *            查询的条件
	 * @return 返回一个List数组对象，存储查询的结果
	 */
	public List<Studio> select(String condt);

}
