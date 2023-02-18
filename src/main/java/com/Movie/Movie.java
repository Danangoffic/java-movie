package com.Movie;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Movie {

	@Id
	@org.springframework.data.annotation.Id
	@SequenceGenerator(
			name = "movie_sequence",
			sequenceName = "movie_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
	)
	@Column(columnDefinition = "BIGINT AUTO_INCREMENT")
	private Long id;
	private String title;
	private String shortDescritiption;
	@Column(columnDefinition = "text")
	private String longDescription;

	@Column(columnDefinition = "text")
	private String trailer;

	@Column(columnDefinition = "text")
	private String movie;
	private String cast;
	private String categories;
	@Column(columnDefinition = "text")
	private String smallThumbnail;

	@Column(columnDefinition = "text")
	private String largeThumbnail;
	private LocalDate releaseDate;
	private String duration;
	private int featured;
	private LocalDateTime deletedAt;
	@CreationTimestamp
	private LocalDateTime CreatedAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	public Movie() {}
	
	public Movie(String title,
		String shortDescritiption,
		String longDescription,
		String trailer,
		String movie,
		String cast,
		String categories,
		LocalDate releaseDate,
		String duration,
		int featured ) {
		this.title = title;
		this.shortDescritiption = shortDescritiption;
		this.longDescription = longDescription;
		this.trailer = trailer;
		this.movie = movie;
		this.cast = cast;
		this.categories = categories;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.featured = featured;
	}
	
	public Movie(String title,
	 String shortDescritiption,
	String longDescription,
	String trailer,
	String movie,
	String cast,
	String categories,
	String smallThumbnail,
	String largeThumbnail,
	LocalDate releaseDate,
	String duration,
	int featured ) {
		this.title = title;
		this.shortDescritiption = shortDescritiption;
		this.longDescription = longDescription;
		this.trailer = trailer;
		this.movie = movie;
		this.cast = cast;
		this.categories = categories;
		this.smallThumbnail = smallThumbnail;
		this.largeThumbnail = largeThumbnail;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.featured = featured;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescritiption() {
		return shortDescritiption;
	}

	public void setShortDescritiption(String shortDescritiption) {
		this.shortDescritiption = shortDescritiption;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getSmallThumbnail() {
		return smallThumbnail;
	}

	public void setSmallThumbnail(String smallThumbnail) {
		this.smallThumbnail = smallThumbnail;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFeatured() {
		return featured;
	}

	public void setFeatured(int featured) {
		this.featured = featured;
	}

	public LocalDateTime getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}

	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
