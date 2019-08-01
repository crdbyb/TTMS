package com.cwcms.util;

import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 处理结果集的规范
 * @author TL
 *
 * @param <T>	查询后结果集集合的类型
 */
public interface IResultSetHandler <T>{

	T handle(ResultSet rs) throws SQLException;
}
