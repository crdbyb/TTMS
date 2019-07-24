package com.cwcms.service.user;

import java.util.List;

import com.cwcms.dao.DAOFactory;
import com.cwcms.model.User;
import com.cwcms.util.ComUtil;

public class LoginServic {

	private User user;

	public boolean canLogin(String username, String password) {
		if(ComUtil.hasLength(password)&&user!=null) {
			if (Encryption.getResult(password).equals(user.getUser_password())) {
				return true;
			}
		}
		return false;
	}

	public boolean hasUser(String username) {
		if (username != null) {
			String condt = "user_name = '" + username + "'";
			List<User> list = DAOFactory.createUserDAO().select(condt);
			if (!list.isEmpty()) {
				user = list.get(0);
				return true;
			}
		}
		return false;
	}

	public User getUser() {
		return user;
	}

	public int saveUser(String name,String tel,String username,String password){
		User user = new User();
		user.setName(name);
		user.setUser_tel(tel);
		user.setUser_name(username);
		user.setUser_password(Encryption.getResult(password));
		user.setUser_type(5);
		DAOFactory.createUserDAO().insert(user);
		this.user=DAOFactory.createUserDAO().select("user_name= '"+username+"'").get(0);
		
		return this.user.getUser_id();
	}
}
