package com.example.movie;

public class MovieResponse {
    private String genre;
    private String movieId;
    private String movieName;

    // Constructors, getters, and setters

    public MovieResponse() {
        // Default constructor
    }

    public MovieResponse(String genre, String movieId, String movieName) {
        this.genre = genre;
        this.movieId = movieId;
        this.movieName = movieName;
    }

    // Getters and Setters

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}


