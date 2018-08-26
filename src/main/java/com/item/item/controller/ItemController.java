package com.item.item.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.item.item.domain.Item;
import com.item.item.service.ItemService;

/**
 * Controller class for UI
 * 
 * @author ppkumar
 *
 */
@Controller
@RequestMapping(value = "/item")
public class ItemController {

	static final Logger logger = LoggerFactory.getLogger(ItemController.class);

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = { "/", "list" })
	public String index(Model model) {
		logger.debug("  index() method  ");
		model.addAttribute("items", itemService.findAll());
		return "index";
	}

	@RequestMapping(value = "create")
	public String create() {
		logger.debug("  create() method ");
		return "create";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(Item item) {
		logger.debug("  save() method  with item name : {}  ", item.getItemName());
		itemService.save(item);
		return "redirect:list";
	}

	@RequestMapping(value = "edit/{id}")
	public String edit(@PathVariable String id, Model model) {
		logger.debug("  edit() method  with item id : {}  ", id);
		model.addAttribute("item", itemService.findById(Long.valueOf(id)));
		return "edit";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(Item item) {
		logger.debug("  update() method  with item name : {}  ", item.getItemName());
		itemService.update(item);
		return "redirect:index";
	}

	@RequestMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("greeting", "Hi");
		return "greeting-view";
	}

}
