package com.hw3.model.vo;

public class Product extends Object {

	
	private String brand;
	private String name;
	private String color;
	private int price;
	
	
	public Product() {}
//	


	public Product(String brand, String name, String color, int price) {
super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
		
	}
	
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return  "brand=" + brand + ", " + "name=" + name + ", " + "color=" +color + ", " 
				+ "price=" +price  ;
		
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();	
	}
	@Override
	public Product clone() {
		return super.clone();
		
	}
	
	
	
	
}
