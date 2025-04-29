package com.example.AbhishekNM.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int saleid;
	private int customerid;
	private int itemid;

	private String saledate;
	private int amount;

	public int getSaleid() {
		return saleid;
	}

	public void setSaleid(int saleid) {
		this.saleid = saleid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getSaledate() {
		return saledate;
	}

	public void setSaledate(String saledate) {
		this.saledate = saledate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Sale [saleid=" + saleid + ", customerid=" + customerid + ", itemid=" + itemid + ", saledate=" + saledate
				+ ", amount=" + amount + "]";
	}

}
