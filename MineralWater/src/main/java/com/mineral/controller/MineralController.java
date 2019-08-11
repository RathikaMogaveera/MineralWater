package com.mineral.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mineral.model.BrandDetails;
import com.mineral.model.Merchant;
import com.mineral.model.OrderDetails;
import com.mineral.model.OrderStatus;
import com.mineral.model.Registration;
import com.mineral.model.ShopImages;
import com.mineral.model.User;
import com.mineral.service.MineralService;

@RestController
public class MineralController {

	@Autowired
	MineralService mineralService;
	
	@GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        User user = mineralService.findById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	
	@GetMapping(value = "/brandDetails/{brandId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BrandDetails> getBrandDetailsById(@PathVariable("brandId") int brandId) {
        System.out.println("Fetching BrandDetails with id " + brandId);
        BrandDetails brandDetails = mineralService.findBrandById(brandId);
        if (brandDetails == null) {
            return new ResponseEntity<BrandDetails>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<BrandDetails>(brandDetails, HttpStatus.OK);
    }
	
	@GetMapping(value = "/merchant/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Merchant> getMerchantById(@PathVariable("id") int id) {
        System.out.println("Fetching Merchant with id " + id);
        Merchant merchant = mineralService.findMerchantById(id);
        if (merchant == null) {
            return new ResponseEntity<Merchant>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Merchant>(merchant, HttpStatus.OK);
    }
	
	@GetMapping(value = "/orderStatus/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderStatus> getOrderStatusById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        OrderStatus orderStatus = mineralService.findOrderStatusById(id);
        if (orderStatus == null) {
            return new ResponseEntity<OrderStatus>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<OrderStatus>(orderStatus, HttpStatus.OK);
    }
	
	@GetMapping(value = "/registration/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Registration> getRegistrationDetailsById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        Registration registration = mineralService.findRegistrationDetailsById(id);
        if (registration == null) {
            return new ResponseEntity<Registration>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Registration>(registration, HttpStatus.OK);
    }
	
	@GetMapping(value = "/shopImages/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ShopImages> getShopImagesById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        ShopImages shopImages = mineralService.findShopImagesById(id);
        if (shopImages == null) {
            return new ResponseEntity<ShopImages>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ShopImages>(shopImages, HttpStatus.OK);
    }
	
	@PostMapping(value = "/brandDetails", headers = "Accept=application/json")
	public ResponseEntity<Void> createBrand(
			@RequestBody BrandDetails brandDetails) {
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		brandDetails.setCreatedOn(dateobj);
		mineralService.createBrandDetails(brandDetails);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/merchantDetails", headers = "Accept=application/json")
	public ResponseEntity<Void> createMerchant(
			@RequestBody Merchant merchant) {
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		merchant.setCreatedOn(dateobj);
		mineralService.createMerchant(merchant);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/orderDetails", headers = "Accept=application/json")
	public ResponseEntity<Void> createOrder(
			@RequestBody OrderDetails orderDetails) {
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		orderDetails.setCreatedOn(dateobj);
		mineralService.createOrderDetails(orderDetails);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/orderStatus", headers = "Accept=application/json")
	public ResponseEntity<Void> createOrderStatus(
			@RequestBody OrderStatus orderStatus) {
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		orderStatus.setCreatedOn(dateobj);
		mineralService.createOrderStatus(orderStatus);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@PostMapping(value = "/registration", headers = "Accept=application/json")
	public ResponseEntity<Void> createRegistration(
			@RequestBody Registration registration) {
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		registration.setCreatedOn(dateobj);
		mineralService.createRegistration(registration);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/shopImages", headers = "Accept=application/json")
	public ResponseEntity<Void> createShopImages(
			@RequestBody ShopImages shopImages) {
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		shopImages.setCreatedOn(dateobj);
		mineralService.createShopImages(shopImages);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/user", headers = "Accept=application/json")
	public ResponseEntity<Void> createUser(
			@RequestBody User user) {
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));
		user.setCreatedOn(dateobj);
		mineralService.createUser(user);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
