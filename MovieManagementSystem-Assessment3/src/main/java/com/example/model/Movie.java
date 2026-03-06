package com.example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  

    private String title;
    private String genre;
    private String director;
    private Integer releaseYear;
    private double rating;
	public Movie(String title, String genre, String director, Integer releaseYear, double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}
    
}