package com.tnsif.collections;

public class Laptop implements Comparable{
	private String brand ;
	private int price;
	private  int gen ;
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getGen() {
		return gen;
	}
	public void setGen(int gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", gen=" + gen + "]";
	}
	
	public int compareTo(Laptop o) {
		if(getPrice()>o.getPrice()) {
		return 1;
	}else
		return -1;
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
