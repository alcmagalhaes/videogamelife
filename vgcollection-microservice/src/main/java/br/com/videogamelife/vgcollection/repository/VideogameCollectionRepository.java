package br.com.videogamelife.vgcollection.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.videogamelife.vgcollection.model.VideogameCollection;

/**
 * @author 
 * Andr� Magalh�es <alcmagalhaes@gmail.com>
 */
public interface VideogameCollectionRepository extends MongoRepository<VideogameCollection, String> { }
