package br.com.videogamelife.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.videogamelife.game.model.GamePlatform;
import br.com.videogamelife.game.repository.GamePlatformRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@RestController
@RequestMapping("/gameplatform")
public class GamePlatformController {
	
	@Autowired
	GamePlatformRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public GamePlatform create(@RequestBody GamePlatform gamePlatform) {
		return repository.save(gamePlatform);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{gamePlatformId}")
	public GamePlatform findById(@PathVariable Long gamePlatformId) {
		return repository.findOne(gamePlatformId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{gamePlatformName}")
	public GamePlatform findByUserId(@PathVariable String gamePlatformName) {
		return repository.findByName(gamePlatformName);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<GamePlatform> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{gamePlatformId}")
	public void remove(@PathVariable Long gamePlatformId) {
		repository.delete(gamePlatformId);
	}

}
