package com.item.item.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.item.item.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    Item findByItemName(String itemName);

}
