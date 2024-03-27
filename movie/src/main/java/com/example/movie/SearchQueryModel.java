package com.example.movie;

public class SearchQueryModel {
    private String searchQuery;

    // Constructors
    public SearchQueryModel() {
        // Default constructor
    }

    public SearchQueryModel(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    // Getter and setter methods
    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}

