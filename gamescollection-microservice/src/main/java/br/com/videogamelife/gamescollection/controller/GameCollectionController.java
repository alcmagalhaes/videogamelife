package br.com.videogamelife.gamescollection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.videogamelife.gamescollection.model.GameCollection;
import br.com.videogamelife.gamescollection.repository.GamesCollectionRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@RestController
@RequestMapping("/gamecollection")
public class GameCollectionController {

	@Autowired
	GamesCollectionRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public GameCollection create(@RequestBody GameCollection gameCollection) {
		return repository.save(gameCollection);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{gameCollectionId}")
	public GameCollection findById(@PathVariable String gameCollectionId) {
		return repository.findOne(gameCollectionId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public GameCollection findByUserId(@PathVariable String userId) {
		return repository.findOne(userId);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<GameCollection> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{gameCollectionId}")
	public void remove(@PathVariable String gameCollectionId) {
		repository.delete(gameCollectionId);
	}
	
}
