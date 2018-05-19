package io.treacy.novauser;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {

	private HashMap<String, User> userMap;
	
	public UserRepository() {
		userMap.put("0001", new User());
	}
	
	public boolean exists(String id) {
		return userMap.containsKey(id);
	}
	
	public User getUser(String id) {
		User user = userMap.get(id);
		
		if(user!=null) {
			return user;
		} else {
			throw new RuntimeException();
		}
		
	}
}
