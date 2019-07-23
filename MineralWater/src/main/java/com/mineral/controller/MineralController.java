package com.mineral.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mineral.model.User;
import com.mineral.service.MineralService;

@RestController
public class MineralController {

	@Autowired
	MineralService mineralService;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        User user = mineralService.findById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	
	 @PostMapping(value="/create",headers="Accept=application/json")
	    public ResponseEntity<Void> createUser(@RequestBody User user){
	        System.out.println("Creating User "+user.getfName());
	        mineralService.createUser(user);
	        
	        return new ResponseEntity<Void>( HttpStatus.CREATED);
	    }
	
}
