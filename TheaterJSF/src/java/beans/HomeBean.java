/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author JamesEich
 */
import XMLparsing.Movie;
import ejb.theaterEJB;
import entity.Theater;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author JamesEich
 */
@Named(value = "homeBean")
@RequestScoped
public class HomeBean{
    @EJB
    private theaterEJB theaterEJB;
    private Theater theater;
    private String zip;
    private String theaterId;
    
    /**
     * Creates a new instance of MainPageBean
     */
    public HomeBean() {
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
    
    public String selectedTheater(Theater theater){
        setTheater(theater);
        return "Showtimes";
    }
    

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }
    
    
    
    
    
    
    
    

    
    
    public String addZip(String zip){
        this.zip = zip;
        return "Theaters.xhtml";
    }
    
    //Fetches the theaters with the user given zip code
    public List<Theater> getTheatersList()
    {
       System.out.println("Theaterlist " + zip);

        if (zip != null)
           return theaterEJB.getTheaters(zip);
        else
           return null;
    }
    
    public List<Movie> getMoviesList(){
        if (theater != null){
            System.out.println("Movie list for " + theater.getTheaterId());
           return theaterEJB.getMovies(theater.getTheaterId());
        }
        else{
                        System.out.println("Movie list for " + "null");

                       return null;

        }
    }
    
    
    
    
}
