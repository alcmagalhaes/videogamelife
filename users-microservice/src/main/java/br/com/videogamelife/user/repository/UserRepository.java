package br.com.videogamelife.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.videogamelife.user.model.Users;

/**
 * @author 
 * Andr� Magalh�es <alcmagalhaes@gmail.com>
 */
public interface UserRepository extends MongoRepository<Users, String> { }
