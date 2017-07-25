package com.loveincode.service;

import java.util.List;

public interface NewsService {

	public List showAllNews();

	public String findNews();

	public String deleteSingleNews(Integer id);

}
