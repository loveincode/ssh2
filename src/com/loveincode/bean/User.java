package com.loveincode.bean;

import java.util.Date;

/**
*
* @author loveincode
* @data Nov 2, 2017 1:59:54 PM
*/
public class User {
	 private int Id;
	    private String username;
	    private String password;
	    private int age;
	    private Date createTime;
	    
	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public Date getCreateTime() {
	        return createTime;
	    }
	    public void setCreateTime(Date createTime) {
	        this.createTime = createTime;
	    }
	    public int getId() {
	        return Id;
	    }
	    public void setId(int id) {
	        Id = id;
	    }
	    
	    public User(int id, String username, String password, int age,
	            Date createTime) {
	        Id = id;
	        this.username = username;
	        this.password = password;
	        this.age = age;
	        this.createTime = createTime;
	    }
	    
	    public User() {
	    }
	    
}
