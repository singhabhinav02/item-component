package com.item.item.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.item.domain.Item;
import com.item.item.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
    static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    private ItemRepository repository;

    public Iterable<Item> findAll() {
        return repository.findAll();
    }

    public Item findById(Long id) {
        return repository.findOne(id);
    }

    public Item findByItemName(String itemName) {
        return repository.findByItemName(itemName);

    }

    public Item save(Item item) {
        logger.debug(" calling save() method  with item name : {}  ", item.getItemName());
        item = repository.save(item);

        return item;
    }

    public Item update(Item item) {
        logger.debug(" calling update() method  with item id : {}  ", item.getId());
        item = repository.save(item);

        return item;
    }

    public void delete(Long id) {
        logger.debug(" calling delete() method  with item id : {}  ", id);
        Item item = repository.findOne(id);
        repository.delete(item);

    }

}
