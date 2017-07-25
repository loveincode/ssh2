package com.loveincode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.loveincode.bean.News;
import com.loveincode.dao.NewsDao;

//创建NewsServiceImpl(实现类)实现NewsService接口
//使用@Service类注解自动注入，并且作用域范围为非单例
@Service 
@Scope("prototype")
public class NewsServiceImpl implements NewsService {
  
  //使用spring内置注解@Autowired自动注入实例
  @Autowired
  private NewsDao nd;
  
  @Override
  public List showAllNews() {
      
      //调用NewsDao的showAllNews方法存入到List<News>集合里
      List<News> allNewList=nd.showAllNews();
      //返回List集合
      return allNewList;
  }

  @Override
  public String findNews() {
      // TODO Auto-generated method stub
      return null;
  }

  @Override
  public String deleteSingleNews(Integer id) {
      
      //定义一个字符串保存到returnValue变量里
      String returnValue="deleteFailed";
      
      //调用NewsDao的deleteSingleNews方法
      returnValue=nd.deleteSingleNews(id);
      
      //返回returnValue
      return returnValue;
  }

}
