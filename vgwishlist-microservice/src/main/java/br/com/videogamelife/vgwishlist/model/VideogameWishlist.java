package br.com.videogamelife.vgwishlist.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@Document(collection = "videogame_whislists")
public class VideogameWishlist {

	@Id
	private String id;
	private String name;
	private String userId;
	private String videogameId;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getVideogameId() {
		return videogameId;
	}
	
	public void setVideogameId(String videogameId) {
		this.videogameId = videogameId;
	}
	
}
