package com.rain.factory;

import com.rain.dao.ArticleDAO;
import com.rain.daoimpl.ArticleDAOImpl;

public class ArticleFactory {
	public static ArticleDAO getArticleInstance(){
		return new ArticleDAOImpl();
	}
}
