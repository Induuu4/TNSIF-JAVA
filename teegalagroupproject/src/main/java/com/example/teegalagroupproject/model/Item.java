package com.example.teegalagroupproject.model;
import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Item {
	
	@Id
	@GeneratedValue
	long Itemid;
	String Itemname;
	LocalDate manufacturing;
	LocalDate expiry;
	float price;
	String category;
	
	public long getId() {
		return Itemid;
	}
	public void setId(long id) {
		this.Itemid = id;
	}
	public String getName() {
		return Itemname;
	}
	public void setName(String name) {
		this.Itemname = name;
	}
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
