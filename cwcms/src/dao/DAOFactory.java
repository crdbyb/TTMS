package com.cwcms.dao;

import com.cwcms.dao.impl.CustomerDAO;
import com.cwcms.dao.impl.PlayDAO;
import com.cwcms.dao.impl.ScheduleDAO;
import com.cwcms.dao.impl.StudioDAO;
import com.cwcms.dao.impl.TicketDAO;
import com.cwcms.dao.impl.UserDAO;

public class DAOFactory {

	public static StudioDAO creatStudioDAO() {
		return new StudioDAO();
	}
	public static UserDAO createUserDAO(){
		return new UserDAO();
	}
	public static CustomerDAO createCustomerDAO(){
		return new CustomerDAO();
	}
	public static PlayDAO createPlayDAO(){
		return new PlayDAO();
	}
	public static TicketDAO craeteTicketDAO(){
		return new TicketDAO();
	}
	public static ScheduleDAO createScheduleDAO(){
		return new ScheduleDAO();
	}
}
