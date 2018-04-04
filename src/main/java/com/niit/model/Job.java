package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String jobID;
	private String jobDesignation;
	private String company;
	private double salary;
	private String location;
	private String jobDesc;
	
}
