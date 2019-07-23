package com.mineral.seviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mineral.Dao.MineralDao;
import com.mineral.model.User;
import com.mineral.service.MineralService;

@Service
@Transactional
public class MineralServiceImpl implements MineralService{

	@Autowired
	MineralDao mineralDao;
	
	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return mineralDao.findById(id);
	}
	
	 public void createUser(User user) {
	        // TODO Auto-generated method stub
		 mineralDao.addUser(user);
	    }

}
