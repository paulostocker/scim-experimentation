package com.stocker.scimexperimentation.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercloud.scim2.server.annotation.ScimResource;
import com.stocker.scimexperimentation.model.User;
import com.stocker.scimexperimentation.model.UserResource;

@RestController
@ScimResource(description = "Access User Resources", name = "User", schema = UserResource.class)
@RequestMapping("/User")
public class UserController {

	@GetMapping("")
	public List<User> all() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User());
		return users;
	}
	
	@GetMapping("/{id}")
	public User one(@PathVariable Long id) {

		return new User("teste", id.toString());
	}
	
	@PostMapping("")
	public User create(@RequestBody User newUser) {
		return new User();
	}
	
	@PutMapping("/{id}")
	public User update(@RequestBody User newUser, @PathVariable Long id) {
		return new User("teste", id.toString());
	}
	
	@PatchMapping("/{id}")
	public User updatePatch(@RequestBody User newUser, @PathVariable Long id) {
		return new User("teste", id.toString());
	}
	
	@DeleteMapping("/{id}")
	public User deleteEmployee(@PathVariable Long id) {
		return new User("teste", id.toString());
	}
	
}
