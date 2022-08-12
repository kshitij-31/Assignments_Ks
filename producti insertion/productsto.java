package com.prodinfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="Products")
public class productsto {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column(length=20)
		private String name;
		@Column
		private int price;
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getID() {
			return id;
		}
		public void setID(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}


