package com.example.j2eedemo.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POST")
public class Post {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="POST_ID")
    private int postId;

    @Column(name="TITLE")
    private String title;

    @Column(name="POST_DATE")
    private Date postDate;

    public int getPostId() {
	return postId;
    }

    public void setPostId(int postId) {
	this.postId = postId;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public Date getPostDate() {
	return postDate;
    }

    public void setPostDate(Date date) {
	this.postDate = date;
    }

}
