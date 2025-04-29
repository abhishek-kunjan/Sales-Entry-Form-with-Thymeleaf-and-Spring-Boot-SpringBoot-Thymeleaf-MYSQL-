package com.example.AbhishekNM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {

	@Id
	private int itemid;

	private String itemname;
	private int price;
	private String purchasedt;
	private String expirydt;
	private String manufactdt;

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPurchasedt() {
		return purchasedt;
	}

	public void setPurchasedt(String purchasedt) {
		this.purchasedt = purchasedt;
	}

	public String getExpirydt() {
		return expirydt;
	}

	public void setExpirydt(String expirydt) {
		this.expirydt = expirydt;
	}

	public String getManufactdt() {
		return manufactdt;
	}

	public void setManufactdt(String manufactdt) {
		this.manufactdt = manufactdt;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", price=" + price + ", purchasedt=" + purchasedt
				+ ", expirydt=" + expirydt + ", manufactdt=" + manufactdt + "]";
	}

}
