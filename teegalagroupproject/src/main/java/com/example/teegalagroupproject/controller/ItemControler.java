package com.example.teegalagroupproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.teegalagroupproject.model.Item;
import com.example.teegalagroupproject.service.ItemService;

@RestController
public class ItemControler {
	@Autowired
	ItemService iservice;
	
	
	@PostMapping("/addItem")
	public Item addItem(@RequestBody Item it)
	{
		return iservice.addItem(it);
	}
	
	@GetMapping("/retrivalItem")
	public List<Item> Item()
	{
		return  iservice.getAllItems();
	}
	@GetMapping("/retrivalItem/{Itemid}")
	public Item getById(@PathVariable Long Itemid)
	{
		return iservice.getById(Itemid);
		
	}
	@DeleteMapping("/deleteItem/{Itemid}")
	public void deleteItem(@PathVariable Long Itemid) {
		iservice.deleteItem(Itemid);
	}
	
	@PutMapping("/updateItem/{Itemid}")
	public Item updateItem(@PathVariable Long Itemid, @RequestBody Item ItemDetails) {
		return iservice.updateItem(Itemid, ItemDetails);
	}
	@DeleteMapping("/deleteItem")
	public void deleteAllItems() {
		iservice.deleteAllItems();
	}

	


}
