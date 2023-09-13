package com.susBackend.services;
import com.susBackend.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.Query;


public interface UserService {
	
	public List<User> getAllUsers();


}
