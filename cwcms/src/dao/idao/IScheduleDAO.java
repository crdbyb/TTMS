package com.cwcms.dao.idao;

import java.util.List;

import com.cwcms.model.Schedule;

public interface IScheduleDAO {
	/**
	 * 插入一条演出计划信息
	 * @param cus	待插入的演出计划对象
	 */
	public void insert(Schedule schedule);
	/**
	 * 更新一条演出计划信息
	 * @param cus	待更新的演出计划对象
	 */
	public void update(Schedule schedule);
	/**
	 * 删除一条演出计划信息
	 * @param ID	待删除演出计划信息ID
	 */
	public void delete(int ID);
	/**
	 * 查询演出计划信息
	 * @param condt	查询限制条件
	 * @return	查询结果
	 */
	public List<Schedule> selete(String condt);
}
