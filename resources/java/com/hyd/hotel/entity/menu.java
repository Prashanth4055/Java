package com.hyd.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class menu {
	
	public menu() {
		
	}
	@Id
	String nonveg;
	String veg;
	String drinks;
	public String getNonveg() {
		return nonveg;
	}
	public void setNonveg(String nonveg) {
		this.nonveg = nonveg;
	}
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
	}
	public String getDrinks() {
		return drinks;
	}
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
	@Override
	public String toString() {
		return "menu [nonveg=" + nonveg + ", veg=" + veg + ", drinks=" + drinks + "]";
	}
	

}
