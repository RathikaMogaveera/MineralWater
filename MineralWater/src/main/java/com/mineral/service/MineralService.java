package com.mineral.service;

import com.mineral.model.User;

public interface MineralService {
	public User findById(long id);
	public void createUser(User user);
}
