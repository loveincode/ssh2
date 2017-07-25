package com.loveincode.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.loveincode.bean.News;
import com.loveincode.service.NewsService;
import com.opensymphony.xwork2.ActionSupport;


//创建NewsAction(action类)继承ActionSupport接口
//使用@Controller类注解自动注入，并且作用域范围为非单例
@Controller
@Scope("prototype")
public class NewsAction extends ActionSupport {
  
  //获取从客户端传递过来的值
  private Integer id;
  
  //struts自动的赋值
  public void setId(Integer id) {
      this.id = id;
  }
  
  //使用spring内置注解@Autowired自动注入实例
  @Autowired
  private NewsService ns;
  
  private List<News> allNewList;
  
  public List<News> getAllNewList() {
      return allNewList;
  }
  
  public void setAllNewList(List<News> allNewList) {
      this.allNewList = allNewList;
  }

  //查询出所有数据
  public String showAllNews(){
      
      allNewList=ns.showAllNews();
      
      return "success";
  }
  
  //查询单条数据(本例未使用)
  public String findNews(){
      
      return "";
  }
  
  //删除某条数据
  public String deleteSingleNews(){
      
      System.out.println("客户端传过来的id值是："+id);
      
      String returnValue=ns.deleteSingleNews(id);
      
      return returnValue;
  }
}
