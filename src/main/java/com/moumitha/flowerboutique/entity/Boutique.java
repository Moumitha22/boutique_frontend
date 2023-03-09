package com.moumitha.flowerboutique.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "boutique")
public class Boutique {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "flower")
	private String flower;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "available")
	private int available;
	
	@Column(name = "price")
	private int price;
	
	
	public Boutique() {}
	
	public Boutique(int id,String flower,String color,String type,int avail,int price) {
		this.id = id;
		this.flower = flower;
		this.color = color;
		this.type = type;
		this.available = avail;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
