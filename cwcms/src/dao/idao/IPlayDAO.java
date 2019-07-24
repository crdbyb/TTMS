package com.cwcms.dao.idao;

import java.util.List;

import com.cwcms.model.Play;

public interface IPlayDAO {
	/**
	 * 插入一条剧目信息
	 * @param cus	待插入的剧目对象
	 */
	public int insert(Play play);
	/**
	 * 更新一条剧目信息
	 * @param cus	待更新的剧目对象
	 */
	public void update(Play play);
	/**
	 * 删除一条剧目信息
	 * @param ID	待删除剧目信息ID
	 */
	public void delete(int ID);
	/**
	 * 查询剧目信息
	 * @param condt	查询限制条件
	 * @return	查询结果
	 */
	public List<Play> selete(String condt);
}
