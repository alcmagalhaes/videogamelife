package br.com.videogamelife.game.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@Entity
@Table(name="game_platforms")
public class GamePlatform {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="game_platform_id")
	private long id;
	@Column(name="game_platform_name")
	private String name;
	@ManyToMany(mappedBy = "game_platforms")
	private Set<Games> games;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Games> getGames() {
		return games;
	}
	
	public void setGames(Set<Games> games) {
		this.games = games;
	}
	
}
