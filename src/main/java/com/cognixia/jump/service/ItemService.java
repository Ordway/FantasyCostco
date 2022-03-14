package com.cognixia.jump.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.cognixia.jump.exception.ResourceNotFoundException;
import com.cognixia.jump.model.User;
import com.cognixia.jump.model.User.Role;
import com.cognixia.jump.model.Item;
import com.cognixia.jump.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository repo;
	

	public List<Item> getAllItem() {
		
		return repo.findAll();
	}
}
