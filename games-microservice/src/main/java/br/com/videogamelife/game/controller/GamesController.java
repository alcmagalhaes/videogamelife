package br.com.videogamelife.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.videogamelife.game.model.Games;
import br.com.videogamelife.game.repository.GamesRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@RestController
@RequestMapping("/games")
public class GamesController {

	@Autowired
	GamesRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Games create(@RequestBody Games games) {
		return repository.save(games);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{gameId}")
	public Games findById(@PathVariable Long gameId) {
		return repository.findOne(gameId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{gameName}")
	public Games findByUserId(@PathVariable String gameName) {
		return repository.findByName(gameName);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/{gameGenre}")
	public List<Games> findByGenre(@PathVariable String gameGenre) {
		return repository.findByGenre(gameGenre);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<Games> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{gameId}")
	public void remove(@PathVariable Long gameId) {
		repository.delete(gameId);
	}
	
}
