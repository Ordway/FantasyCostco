package com.cognixia.jump.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Item;

@Repository
public interface ItemRepository extends JpaRepository <Item, Integer>{


		// used to find a user by their username
		// Optional is used in case username given is not in table
		public Optional<Item> findByItem(String name);
}
