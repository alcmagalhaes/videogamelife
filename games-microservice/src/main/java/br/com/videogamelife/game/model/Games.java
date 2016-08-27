package br.com.videogamelife.game.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;


/**
 * @author 
 * André Magalhães <alcmagalhaes@gmail.com>
 */
@Entity
@Table(name="games")
public class Games {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="game_id")
	private Long id;
	@Column(name="game_name")
	private String name;
	@Column(name="game_developer")
	private String developer;
	@Column(name="game_publisher")
	private String publisher;
	@Column(name="game_designer")
	private String designer;
	@Column(name="game_series")
	private String series;
	@Column(name="game_genre")
	private String genre;
	@Column(name="game_release_date")
	// Sera mapeado no MySQL como DATE, i.e. somente data, sem timestamp
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate releaseDate;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
				name = "game_x_platform", 
				joinColumns =	@JoinColumn(name = "game_id", referencedColumnName = "game_id"), 
				inverseJoinColumns = @JoinColumn(name = "platform_id", referencedColumnName = "platform_id")
			  )
	private Set<GamePlatform> platforms;	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getDesigner() {
		return designer;
	}
	
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	
	public String getSeries() {
		return series;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public Set<GamePlatform> getPlatforms() {
		return platforms;
	}
	
	public void setPlatforms(Set<GamePlatform> platforms) {
		this.platforms = platforms;
	}

}
