package com.Arc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class Student_info {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String first;
	
	private String last;
	
	private String std;
	
	private long phone_number = (long) (Math.random()*Math.pow(10, 10));
	
	private String stream;
	
}
