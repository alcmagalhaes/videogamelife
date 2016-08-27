package br.com.videogamelife.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.videogamelife.game.model.Games;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
public interface GamesRepository extends JpaRepository<Games, Long> { 
	
	@Query("SELECT g FROM Games g WHERE g.name = ?")
	Games findByName(String name);
	
	@Query("SELECT g FROM Games g WHERE g.genre = ?")
	List<Games> findByGenre(String genre);
	
}
