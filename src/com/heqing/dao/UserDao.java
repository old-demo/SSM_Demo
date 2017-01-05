package com.heqing.dao;

import java.util.List;

import com.heqing.base.BaseDao;
import com.heqing.bean.User;
import com.heqing.bean.User_Role;

/**
 * 持久层，数据访问对象
 */
public interface UserDao extends BaseDao<User> {
	
	public void setUser_Role(List<User_Role> urs);
	
	public User getByName(String name);
}
