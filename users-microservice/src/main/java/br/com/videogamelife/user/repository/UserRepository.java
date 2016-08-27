package br.com.videogamelife.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.videogamelife.user.model.Users;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
public interface UserRepository extends MongoRepository<Users, String> { }
