package com.rain.factory;

import com.rain.dao.MessageDAO;
import com.rain.daoimpl.MessageDAOImpl;

public class MessageFactory {
	public static MessageDAO getMessageDAOInstance(){
		return new MessageDAOImpl();
	}
}
