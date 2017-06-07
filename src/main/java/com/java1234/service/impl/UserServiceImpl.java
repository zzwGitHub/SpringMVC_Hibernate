package com.java1234.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java1234.dao.IUserDao;
import com.java1234.model.User;
import com.java1234.service.IUserService;


@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	@Transactional
	@Override
	public void userAdd(User user) {
		userDao.userAdd(user);

	}

}
