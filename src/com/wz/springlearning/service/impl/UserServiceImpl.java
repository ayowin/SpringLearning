package com.wz.springlearning.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.springlearning.dao.UserDao;
import com.wz.springlearning.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserDao userDao;
    
    @Override
    public String doService() {
	return "UserServiceImpl has completed the service...";
    }
    
    @Override
    public String toString() {
        String tmp = "";
        tmp += "UserServiceImpl: {\n\t";
        tmp += this.doService();
        tmp += "\n\t";
        tmp += this.userDao.toString();
        tmp += "\n}";
        return tmp;
    }
}
