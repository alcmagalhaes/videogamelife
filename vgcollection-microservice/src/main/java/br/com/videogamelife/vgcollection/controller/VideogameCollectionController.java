package br.com.videogamelife.vgcollection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.videogamelife.vgcollection.model.VideogameCollection;
import br.com.videogamelife.vgcollection.repository.VideogameCollectionRepository;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@RestController
@RequestMapping("/videogamecollection")
public class VideogameCollectionController {

	@Autowired
	VideogameCollectionRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public VideogameCollection create(@RequestBody VideogameCollection videogameCollection) {
		return repository.save(videogameCollection);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{videogameCollectionId}")
	public VideogameCollection findById(@PathVariable String videogameCollectionId) {
		return repository.findOne(videogameCollectionId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public VideogameCollection findByUserId(@PathVariable String userId) {
		return repository.findOne(userId);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public List<VideogameCollection> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/remove/{videogameCollectionId}")
	public void remove(@PathVariable String videogameCollectionId) {
		repository.delete(videogameCollectionId);
	}
	
}

