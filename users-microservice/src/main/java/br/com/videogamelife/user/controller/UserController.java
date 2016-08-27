package br.com.videogamelife.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.videogamelife.user.model.Users;
import br.com.videogamelife.user.repository.UserRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired 
	UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Users create(@RequestBody Users user) {
		return userRepository.save(user);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/id/{userId}")
	public Users findById(@PathVariable String userId) {
		return userRepository.findOne(userId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/username/{username}")
	public Users findByUsername(@PathVariable String username) {
		return userRepository.findOne(username);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<Users> findAll() {
		return userRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{userId}")
	public String remove(@PathVariable String userId) {
		userRepository.delete(userId);
		return "Usuário removido.";
	}
	
}
