package br.com.videogamelife.videogame.model;

import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@Document(collection = "videogames")
public class Videogame {

	@Id
	private String id;
	private String name;
	private String generation;
	private String manufaturer;
	private LocalDate releaseDate;
	private LocalDate discontinuedDate;
	
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
	
	public String getGeneration() {
		return generation;
	}
	
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	
	public String getManufaturer() {
		return manufaturer;
	}
	
	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public LocalDate getDiscontinuedDate() {
		return discontinuedDate;
	}
	
	public void setDiscontinuedDate(LocalDate discontinuedDate) {
		this.discontinuedDate = discontinuedDate;
	}
	
}
