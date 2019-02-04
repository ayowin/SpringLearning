package com.wz.springlearning.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wz.springlearning.dao.UserDao;
import com.wz.springlearning.entities.User;

public class UserDaoImpl implements UserDao {
    
    @Autowired
    private User user;
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUserById(int id) {
	return this.user;
    }
    
    @Override
    public String toString() {
        String tmp = "";
        tmp += "UserDaoImpl: ";
        tmp += this.user.toString();
        return tmp;
    }
}
