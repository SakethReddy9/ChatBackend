package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int blogID;
	private String blogName;
	private String blogContent;
	private Date createDate;
	private int likes;
	private int dislikes;
	private String loginName;
	private String status;
	
	
}
