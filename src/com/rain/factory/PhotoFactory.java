package com.rain.factory;

import com.rain.dao.PhotoDAO;
import com.rain.daoimpl.PhotoDAOImpl;

public class PhotoFactory {
	public static PhotoDAO getPhotoDAOInstance(){
		return new PhotoDAOImpl();
	}
}
