package com.example.minebayrakdar.mine_bayrakdar_assignment1;


public class Movie {
    private String movie;
    private String language;
    private String session;
    private int image;

    public Movie(String movie, String language, String session, int image) {
        super();
        this.movie = movie;
        this.language = language;
        this.session = session;
        this.image = image;
    }

    @Override
    public String toString() {
        return movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }
}
