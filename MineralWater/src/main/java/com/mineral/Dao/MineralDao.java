package com.mineral.Dao;

import com.mineral.model.User;

public interface MineralDao {
	 public User findById(long id);
	 public void addUser(User user);
}
