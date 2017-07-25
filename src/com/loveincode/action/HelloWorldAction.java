package com.loveincode.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

//创建HelloWorldAction(action类)继承ActionSupport接口
//使用@Controller类注解自动注入，并且作用域范围为非单例
@Controller
@Scope("prototype")
public class HelloWorldAction extends ActionSupport {
	
	//查询出所有数据
	  public String helloworld(){
	      return "success";
	  }
	
}
