package com.mineral.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mineral.Dao.MineralDao;
import com.mineral.model.BrandDetails;
import com.mineral.model.Merchant;
import com.mineral.model.OrderDetails;
import com.mineral.model.OrderStatus;
import com.mineral.model.Registration;
import com.mineral.model.ShopImages;
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
	

	@Override
	public BrandDetails findBrandById(int brandId) {
		Session session = sessionFactory.getCurrentSession();
        BrandDetails brandDetails= session.get(BrandDetails.class,brandId);
        return brandDetails;
	}
	
	@Override
	public Merchant findMerchantById(int id) {
		Session session = sessionFactory.getCurrentSession();
        Merchant merchant= session.get(Merchant.class,id);
        return merchant;
	}
	
	@Override
	public OrderStatus findOrderStatusById(int id) {
		Session session = sessionFactory.getCurrentSession();
		OrderStatus orderStatus= session.get(OrderStatus.class,id);
        return orderStatus;
	}
	
	@Override
	public Registration findRegistrationDetailsById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Registration registration= session.get(Registration.class,id);
        return registration;
	}


	@Override
	public ShopImages findShopImagesById(int id) {
		Session session = sessionFactory.getCurrentSession();
		ShopImages shopImages= session.get(ShopImages.class,id);
        return shopImages;
	}

	@Override
	public void createBrandDetails(BrandDetails brandDetails) {
		 Session session = sessionFactory.getCurrentSession();
	     session.save(brandDetails);		
	}


	@Override
	public void createMerchant(Merchant merchant) {
		 Session session = sessionFactory.getCurrentSession();
	     session.save(merchant);	
	}


	@Override
	public void createOrderDetails(OrderDetails orderDetails) {
		Session session = sessionFactory.getCurrentSession();
	    session.save(orderDetails);
		
	}


	@Override
	public void createOrderStatus(OrderStatus orderStatus) {
		Session session = sessionFactory.getCurrentSession();
	    session.save(orderStatus);
	}


	@Override
	public void createRegistration(Registration registration) {
		Session session = sessionFactory.getCurrentSession();
	    session.save(registration);
		
	}


	@Override
	public void createShopImages(ShopImages shopImages) {
		Session session = sessionFactory.getCurrentSession();
	    session.save(shopImages);	
	}


	@Override
	public void createUser(User user) {
		Session session = sessionFactory.getCurrentSession();
	    session.save(user);	
	}
}
