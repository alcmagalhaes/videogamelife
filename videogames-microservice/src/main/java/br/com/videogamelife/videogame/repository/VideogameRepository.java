package br.com.videogamelife.videogame.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.videogamelife.videogame.model.Videogame;

/**
 * @author 
 * Andr� Magalh�es <alcmagalhaes@gmail.com>
 */
public interface VideogameRepository extends MongoRepository<Videogame, String> { }
