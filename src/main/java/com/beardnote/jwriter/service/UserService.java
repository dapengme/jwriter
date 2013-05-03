package com.beardnote.jwriter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beardnote.jwriter.dao.UserDao;
import com.beardnote.jwriter.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public void save(User user) {
		userDao.clear();
		userDao.save(user);
	}

	public String getUsername() {
		return "zhaopeng";
	}
}
