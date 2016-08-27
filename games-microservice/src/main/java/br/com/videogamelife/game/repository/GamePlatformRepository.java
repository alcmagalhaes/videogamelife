package br.com.videogamelife.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.videogamelife.game.model.GamePlatform;

/**
 * @author 
 * Andr� Magalh�es <alcmagalhaes@gmail.com>
 */
public interface GamePlatformRepository extends JpaRepository<GamePlatform, Long> {
	
	@Query("SELECT gp FROM GamePlatform gp WHERE gp.name = ?")
	GamePlatform findByName(String name);
	
}
