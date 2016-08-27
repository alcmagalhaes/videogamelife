package br.com.videogamelife.gameswishlist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.videogamelife.gameswishlist.model.GameWishlist;

/**
 * @author 
 * Andr� Magalh�es <alcmagalhaes@gmail.com>
 */
public interface GameWishlistRepository extends MongoRepository<GameWishlist, String> { }
