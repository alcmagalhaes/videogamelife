/**
 * 
 */
package br.com.videogamelife.videogame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.videogamelife.videogame.model.Videogame;
import br.com.videogamelife.videogame.repository.VideogameRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
public class VideogameController {
	
	@Autowired
	VideogameRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Videogame create(@RequestBody Videogame videogame) {
		return repository.save(videogame);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{videogameId}")
	public Videogame findById(@PathVariable String videogameId) {
		return repository.findOne(videogameId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public Videogame findByUserId(@PathVariable String userId) {
		return repository.findOne(userId);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<Videogame> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{videogameId}")
	public void remove(@PathVariable String videogameId) {
		repository.delete(videogameId);
	}

}
