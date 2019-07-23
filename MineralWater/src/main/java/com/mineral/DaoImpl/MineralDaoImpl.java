package com.mineral.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mineral.Dao.MineralDao;
import com.mineral.model.User;

@Repository
public class MineralDaoImpl implements MineralDao{

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	@Override
	public User findById(long id) {
		Session session = sessionFactory.getCurrentSession();
        User user= session.get(User.class,id);
        return user;
	}
	

    public void addUser(User user) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }

}
