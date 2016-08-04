/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLparsing;

/**
 *
 * @author JamesEich
 */
public class Movie {
    
    private String title;
    private String runtime;
    private String genre;
    private String rating;
    private String plot;
    private String poster;
    private String imdbrating;
    private String imdbId;
    
    //Constructor

    public Movie() {
    }
    
    public Movie(String title, String duration, String type) {
        this.title = title;
        this.runtime = duration;
        this.genre = type;
    }

    public Movie(String title, String runtime, String genre, String rating, String plot, String poster, String imbdrating, String imdbID) {
        this.title = title;
        this.runtime = runtime;
        this.genre = genre;
        this.rating = rating;
        this.plot = plot;
        this.poster = poster;
        this.imdbrating = imbdrating;
        this.imdbId = imdbID;
    }

  
    
    //Getter/Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getImdbrating() {
        return imdbrating;
    }

    public void setImdbrating(String imdbrating) {
        this.imdbrating = imdbrating;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }
    
    
    
    
}
