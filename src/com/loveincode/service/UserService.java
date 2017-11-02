package com.loveincode.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.loveincode.bean.User;

/**
*
* @author loveincode
* @data Nov 2, 2017 2:00:24 PM
*/
public class UserService {
	// new一个用户列表数据对象，模拟持久层数据
    private static Map<Integer, User> users = new HashMap<Integer, User>();

    // 初始化用户列表数据，模拟持久层数据
    static {
        users.put(1, new User(1, "robin1", "password1", 18, new Date()));
        users.put(2, new User(2, "robin2", "password2", 19, new Date()));
        users.put(3, new User(3, "robin3", "password3", 20, new Date()));
        users.put(4, new User(4, "robin4", "password4", 21, new Date()));
        users.put(5, new User(5, "robin5", "password5", 22, new Date()));
    }

    /**
     * 通过用户ID取得用户实体
     * @param id
     * @return
     */
    public User getId(int id) {
        return users.get(id);
    }

    /**
     * 取得所有用户列表
     * @return
     */
    public List<User> getAll() {
        return new ArrayList<User>(users.values());
    }

    /**
     * 更新用户
     * @param user
     */
    public void update(User user) {
        if (user.getId() > 0) {
            users.put(user.getId(), user);
        }
    }

    /**
     * 新增用户
     * @param user
     */
    public void add(User user) {
        int size = users.size();
        int id = size + 1;
        user.setId(id);
        users.put(id, user);
    }

    /**
     * 删除用户
     * @param id
     */
    public void remove(int id) {
        users.remove(id);
    }
}
