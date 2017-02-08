package com.rain.dao;

import java.util.List;

import com.rain.bean.Message;

public interface MessageDAO {
	public void save_Msssage(Message message);
	public List<Message> show_Message_list();
}
