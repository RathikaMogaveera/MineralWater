package com.mineral.service;

import com.mineral.model.BrandDetails;
import com.mineral.model.Merchant;
import com.mineral.model.OrderDetails;
import com.mineral.model.OrderStatus;
import com.mineral.model.Registration;
import com.mineral.model.ShopImages;
import com.mineral.model.User;

public interface MineralService {
	
	public User findById(int id);
	
	public BrandDetails findBrandById(int brandId);
	
	public Merchant findMerchantById(int id);
	
	public OrderStatus findOrderStatusById(int id);
	
	public Registration findRegistrationDetailsById(int id);
	
	public ShopImages findShopImagesById(int id);

	public void createBrandDetails(BrandDetails brandDetails);

	public void createMerchant(Merchant merchant);

	public void createOrderDetails(OrderDetails orderDetails);

	public void createOrderStatus(OrderStatus orderStatus);

	public void createRegistration(Registration registration);

	public void createShopImages(ShopImages shopImages);

	public void createUser(User user);

}
