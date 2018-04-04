package com.niit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Forum {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int forumID;
	private String forumName;
	private String forumContent;
	private Date createDate;
	private int likes;
	private int dislikes;
	private String loginName;
	private String status;
}
