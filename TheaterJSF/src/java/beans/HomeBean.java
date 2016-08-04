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
import entity.Checkout;
import entity.Theater;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author JamesEich
 */
@Named(value = "homeBean")
@SessionScoped
public class HomeBean implements Serializable{
    @EJB
    private theaterEJB theaterEJB;
    private Theater theater;
    private Checkout checkout;
    private Movie movie;
    private String zip;
    private String theaterId;
    private String selectedTime; 
    
    
    /**
     * Creates a new instance of MainPageBean
     */
    public HomeBean() {
    }

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
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

    public String getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(String selectedTime) {
        this.selectedTime = selectedTime;
    }
    
    
    
    
    //Checkout Object
    public Checkout getCheckout() {
        return checkout;
    }

    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }
    
    public String copyCheckout(Checkout ch){
        this.checkout = ch;
        return "Checkout.xhtml";
    }

    
    
    
    
    
    //Movie Object
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public String copyMovie(Movie mov){
        this.movie = mov;
        return "Checkout.xhtml";
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
        if (theaterId != null){
            System.out.println("Movie list for " + theaterId);
           return theaterEJB.searchMovies(theaterId);
        }
        else{
            System.out.println("Movie list for " + "null");
            return null;
        }
    }
    
    public List<String> getTimesList(String imdbId){
        if ((theaterId != null)&&(imdbId != null)){
            System.out.println("Movie times for movie " + imdbId + " at " + theaterId);
           return theaterEJB.getMovieTimes(theaterId, imdbId);
        }
        else{
            System.out.println("Movie list for " + "null");
            return null;
        }
    }
    
    
    
    
}
