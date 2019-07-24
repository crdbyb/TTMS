package com.cwcms.dao.idao;

import java.util.List;

import com.cwcms.model.Ticket;

public interface ITicketDAO {
	/**
	 * 添加一个票
	 * @param use	添加的票对象
	 */
	public void insert(Ticket tic);
	/**
	 * 更新一张票
	 * @param use  待更新的票对象
	 */
	public void update(Ticket tic);
	/**
	 * 删除一张票
	 * @param ID	待删除票的ID
	 */
	public void delete(int ID);
	/**
	 * 查询票信息
	 * @param condt	查询限制条件
	 * @return	查询结果
	 */
	public List<Ticket> select(String condt);
}
