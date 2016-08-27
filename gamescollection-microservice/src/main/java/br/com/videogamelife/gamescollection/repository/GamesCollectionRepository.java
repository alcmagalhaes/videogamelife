package br.com.videogamelife.gamescollection.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.videogamelife.gamescollection.model.GameCollection;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
public interface GamesCollectionRepository extends MongoRepository<GameCollection, String> { }
