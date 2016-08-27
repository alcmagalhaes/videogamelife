package br.com.videogamelife.vgwishlist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.videogamelife.vgwishlist.model.VideogameWishlist;

/**
 * @author 
 * Andr� Magalh�es <alcmagalhaes@gmail.com>
 */
public interface VideogameWishlistRepository extends MongoRepository<VideogameWishlist, String> { }
