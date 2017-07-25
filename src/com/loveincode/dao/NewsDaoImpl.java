package com.loveincode.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.loveincode.bean.News;

//创建NewsDaoImpl(实现类)实现NewsDao接口
//使用@Repository类注解自动注入，并且作用域范围为非单例
@Repository
@Scope("prototype")
public class NewsDaoImpl implements NewsDao {
  
  //使用spring内置注解@Autowired自动注入实例
  @Autowired
  private SessionFactory sf;
  
  @Override
  public List showAllNews() {
      //重新建立一个新的session 
      Session session=sf.openSession();
      //创建Query
      Query query=session.createQuery("from News");
      
      //将结果集保存到List<News>集合里
      List<News> allNewList=query.getResultList();
      
      //关闭session
      session.close();
      
      //返回List<News>集合
      return allNewList;
  }

  @Override
  public String findNews() {
      // TODO Auto-generated method stub
      return null;
  }

  @Override
  public String deleteSingleNews(Integer id) {
      //重新建立一个新的session 
      Session session=sf.openSession();
      //创建Query并将id值设置为传过来的参数值
      Query query=session.createQuery("from News where id=:myid");
      query.setParameter("myid", id);
      //将结果集保存到List<News>集合里
      List<News> deleteList=query.getResultList();
      
      //判断deleteList有没有值，如果有，则执行下面的语句，如果没有，则什么都不做
      if(deleteList.size()==1){
          //获取deleteList中的值并保存到News对象中
          News news=deleteList.get(0);
          //在控制台输出：删除对象和id值
          System.out.println("删除对象："+news.getTitle()+" Id:"+news.getId());
          //创建事务
          session.getTransaction().begin();
          //删除对象
          session.delete(news);
          //提交事务
          session.getTransaction().commit();
          //关闭session
          session.close();
      }
      
      //返回字符串deleteOK
      return "deleteOK";
  }

}
