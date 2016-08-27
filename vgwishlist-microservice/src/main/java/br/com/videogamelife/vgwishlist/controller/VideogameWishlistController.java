package br.com.videogamelife.vgwishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.videogamelife.vgwishlist.model.VideogameWishlist;
import br.com.videogamelife.vgwishlist.repository.VideogameWishlistRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@RestController
@RequestMapping("/videogamewhishlist")
public class VideogameWishlistController {

	@Autowired
	VideogameWishlistRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public VideogameWishlist create(@RequestBody VideogameWishlist videogameWhislist) {
		return repository.save(videogameWhislist);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{videogameWhislistId}")
	public VideogameWishlist findById(@PathVariable String videogameWhislistId) {
		return repository.findOne(videogameWhislistId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public VideogameWishlist findByUserId(@PathVariable String userId) {
		return repository.findOne(userId);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<VideogameWishlist> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{videogameWhislistId}")
	public void remove(@PathVariable String videogameWhislistId) {
		repository.delete(videogameWhislistId);
	}
	
}
