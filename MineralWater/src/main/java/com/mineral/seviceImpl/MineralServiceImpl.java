package com.mineral.seviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mineral.Dao.MineralDao;
import com.mineral.model.BrandDetails;
import com.mineral.model.Merchant;
import com.mineral.model.OrderDetails;
import com.mineral.model.OrderStatus;
import com.mineral.model.Registration;
import com.mineral.model.ShopImages;
import com.mineral.model.User;
import com.mineral.service.MineralService;

@Service
@Transactional
public class MineralServiceImpl implements MineralService{

	@Autowired
	MineralDao mineralDao;
	
	@Override
	public User findById(int id) {
		return mineralDao.findById(id);
	}
	
	@Override
	public BrandDetails findBrandById(int brandId) {
		return mineralDao.findBrandById(brandId);
	}
	
	@Override
	public Merchant findMerchantById(int id) {	
		return mineralDao.findMerchantById(id);
	}
	
	@Override
	public OrderStatus findOrderStatusById(int id) {
		return mineralDao.findOrderStatusById(id);
	}
	
	@Override
	public Registration findRegistrationDetailsById(int id) {
		return mineralDao.findRegistrationDetailsById(id);
	}

	@Override
	public ShopImages findShopImagesById(int id) {
		return mineralDao.findShopImagesById(id);
	}
	
	@Override
	public void createBrandDetails(BrandDetails brandDetails) {
		mineralDao.createBrandDetails(brandDetails);
		
	}

	@Override
	public void createMerchant(Merchant merchant) {
		mineralDao.createMerchant(merchant);
	}

	@Override
	public void createOrderDetails(OrderDetails orderDetails) {
		mineralDao.createOrderDetails(orderDetails);
		
	}

	@Override
	public void createOrderStatus(OrderStatus orderStatus) {
		mineralDao.createOrderStatus(orderStatus);
		
	}

	@Override
	public void createRegistration(Registration registration) {
		mineralDao.createRegistration(registration);
		
	}

	@Override
	public void createShopImages(ShopImages shopImages) {
		mineralDao.createShopImages(shopImages);
		
	}

	@Override
	public void createUser(User user) {
		mineralDao.createUser(user);
	}
}
