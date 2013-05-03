package com.beardnote.jwriter.dao;

import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beardnote.jwriter.model.User;

@Repository
public class UserDao {

	@Autowired
	private Dao dao;

	public void save(User user) {
		dao.insert(user);
	}

	public void clear() {
		dao.clear(User.class, Cnd.where("id", ">", 10));
	}
}
