package com.item.item.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.item.item.domain.Item;
import com.item.item.service.ItemService;

/**
 * Rest controller class
 * 
 * @author ppkumar
 *
 */
@RestController
@RequestMapping(value = "/rest/item")
public class ItemRestController {
    static final Logger logger = LoggerFactory.getLogger(ItemRestController.class);

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Item saveItem(@RequestBody Item item) {
        logger.debug("  saveitem() method  with item name : {}  ", item.getItemName());
        return itemService.save(item);
    }

    /**
     * 
     * @param item
     * @return
     */

    @RequestMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    public Item updateitem(@RequestBody Item item) {
        logger.debug("  updateitem() method  with item name : {}  ", item.getItemName());
        return itemService.update(item);
    }

    @RequestMapping(value = "/itemId/{itemId}",
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            method = RequestMethod.GET)
    public Item getByItemId(@PathVariable Long itemId) {
        logger.debug("  getByitemId() method  with item id : {}  ", itemId);
        return itemService.findById(itemId);
    }

    @RequestMapping(value = "/itemName/{itemName}",
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            method = RequestMethod.GET)
    public Item getByItemName(@PathVariable String itemName) {
        logger.debug("  getByItemName() method  with item name : {}  ", itemName);
        Item item = itemService.findByItemName(itemName);
        return item;
    }

    @RequestMapping(value = "/{itemId}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Long itemId) {
        logger.debug("  deleteitem() method  with item id : {}  ", itemId);
        itemService.delete(itemId);
    }

    @RequestMapping(value = "/list", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            method = RequestMethod.GET)
    public ResponseEntity<Iterable<Item>> getItems() {
        logger.debug("  getitems() method");

        // Iterable<ItemDTO> items = itemConsumerService.getItems();
        return new ResponseEntity<Iterable<Item>>(itemService.findAll(), HttpStatus.OK);

        // return (Iterable<Item>) itemService.findAll();
    }
}
