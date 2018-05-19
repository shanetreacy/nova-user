package io.treacy.novauser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

	UserRepository repository;
	
	@Autowired
	public UserController(UserRepository repository) {
	this.repository = repository;	
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable String id) {
		return repository.getUser(id);
	}
	
}
