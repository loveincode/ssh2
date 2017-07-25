package com.loveincode.dao;

import java.util.List;

//创建NewsDao(接口类)
public interface NewsDao {

	public List showAllNews();

	public String findNews();

	public String deleteSingleNews(Integer id);
}
