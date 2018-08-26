package com.item.item.service;

import com.item.item.domain.Item;

public interface ItemService {
	Iterable<Item> findAll();

	Item findById(Long id);
	
	Item findByItemName(String itemName);

	Item save(Item item);

	Item update(Item id);

	void delete(Long id);

}
