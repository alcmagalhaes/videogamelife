package br.com.videogamelife.gameswishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.videogamelife.gameswishlist.model.GameWishlist;
import br.com.videogamelife.gameswishlist.repository.GameWishlistRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@RestController
@RequestMapping("/gamewishlist")
public class GameWishlistController {

	@Autowired
	GameWishlistRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public GameWishlist create(@RequestBody GameWishlist gameWishlist) {
		return repository.save(gameWishlist);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{gameWishlistId}")
	public GameWishlist findById(@PathVariable String gameWishlistId) {
		return repository.findOne(gameWishlistId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public GameWishlist findByUserId(@PathVariable String userId) {
		return repository.findOne(userId);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<GameWishlist> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{gameWishlistId}")
	public void remove(@PathVariable String gameWishlistId) {
		repository.delete(gameWishlistId);
	}
	
}
