package com.example.locashare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rider {
	@Id
	int user_id;
	String user_name;
		int aadhar_no;
		String from;
		String to;
		int pickup_time;
		int drop_time;
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public int getAadhar_no() {
			return aadhar_no;
		}
		public void setAadhar_no(int aadhar_no) {
			this.aadhar_no = aadhar_no;
		}
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public int getPickup_time() {
			return pickup_time;
		}
		public void setPickup_time(int pickup_time) {
			this.pickup_time = pickup_time;
		}
		public int getDrop_time() {
			return drop_time;
		}
		public void setDrop_time(int drop_time) {
			this.drop_time = drop_time;
		}
	}


