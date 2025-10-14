  package com.example.teegalagroupproject.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teegalagroupproject.model.Item;
import com.example.teegalagroupproject.repo.ItemRepo;

@Service
public class ItemService {
	
	@Autowired
	ItemRepo irepo;
	
	//Insert
		public Item addItem(Item it) {
			return irepo.save(it);
		}
	// retrieving all the data
		public List<Item> getAllItems(){
			return irepo.findAll();
			}
	// retrieving all the data by id
		public Item getById(Long Itemid){
			 return irepo.findById(Itemid).get();
					
					}
		
	// updating the data
		public Item updateItem(Long Itemid, Item ItemDetails) {
			Item it1 = irepo.findById(Itemid).get();
			it1.setName(ItemDetails.getName());	
			it1.setCategory(ItemDetails.getCategory());	
			
			return irepo.save(it1);	
		}
		
		
		
	//delete by id
		public void deleteItem(Long Itemid)
		{
			irepo.deleteById(Itemid);
		}
		
		
	//entire Deleting of rows
		public void deleteAllItems() {
			irepo.deleteAll();
		}

}
