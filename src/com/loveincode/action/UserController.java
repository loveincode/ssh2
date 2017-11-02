package com.loveincode.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.loveincode.bean.User;
import com.loveincode.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author loveincode
 * @data Nov 2, 2017 2:04:28 PM
 */
@SuppressWarnings("serial")
@Results(@Result(name = "success", type = "redirect", location="/user"))
public class UserController extends ActionSupport implements ModelDriven<Object> {

	// Rest URL请求的ID值
	private int id;
	// 用户实体
	private User model = new User();
	// 用户列表
	private List<User> list;
	// 用户Service
	private UserService userService = new UserService();

	/**
	 * 使用ModelDriven，重写getModel()方法
	 */
	@Override
	public Object getModel() {
		return (list != null ? list : model);
	}

	/**
	 * 设置用户ID
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
		// 如果用户ID大于零，取得用户实体
		if (id > 0) {
			this.model = userService.getId(id);
		}
	}

	/**
	 * 取得用户ID
	 * 
	 * @return
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * 功能：首页 调用：GET /user 返回：user-index.jsp
	 * 
	 * @return
	 */
	public HttpHeaders index() {
		list = userService.getAll();
		return new DefaultHttpHeaders("index").disableCaching();
	}

	/**
	 * 功能：新增一个用户 调用：GET /user/new 返回：user-editNew.jsp
	 * 
	 * @return
	 */
	public String editNew() {
		model = new User();
		return "editNew";
	}

	/**
	 * 功能：保存新增用户 调用：POST /user 返回：user-index.jsp
	 * 
	 * @return
	 */
	public HttpHeaders create() {
		userService.add(this.model);
		return new DefaultHttpHeaders(SUCCESS).setLocationId(this.model.getId());
	}

	/**
	 * 功能：显示用户信息明细，返回show的jsp 调用：GET /user/1 返回：user-show.jsp
	 * 
	 * @return
	 */
	public HttpHeaders show() {
		return new DefaultHttpHeaders("show");
	}

	/**
	 * 功能：编辑用户 调用：GET /user/1/edit 返回：user-edit.jsp
	 * 
	 * @return
	 */
	public String edit() {
		return "edit";
	}

	/**
	 * 功能：更新用户信息 调用：PUT /user/1 返回：user-index.jsp
	 * 
	 * @return
	 */
	public String update() {
		userService.update(this.model);
		addActionMessage("Update user successed.");
		return SUCCESS;
	}

	/**
	 * 功能：删除用户 调用：DELETE /user/1 返回：user-index.jsp
	 * 
	 * @return
	 */
	public String destroy() {
		userService.remove(id);
		addActionMessage("Delete user successed.");
		return SUCCESS;
	}

}