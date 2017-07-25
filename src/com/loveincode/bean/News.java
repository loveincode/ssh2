package com.loveincode.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 跟数据库表一致，作为一个java对象
 * 1个对象代表的是数据库表中的一行记录
 * 1个属性代表的是表中的一个字段
 */
@Entity        //声明当前类为hibernate映射到数据库中的实体类
@Table(name="news")        //声明table的名称
public class News {
    @Id        //声明此列为主键,作为映射对象的标识符
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name="title",nullable=false)
    private String title;
    
    @Column(name="content",nullable=false)
    private String content;
    
    @Column(name="begintime",nullable=false)
    private Date begintime;
    
    @Column(name="username",nullable=false)
    private String username;

    public News() {
        super();
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    public Date getBegintime() {
        return begintime;
    }
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
