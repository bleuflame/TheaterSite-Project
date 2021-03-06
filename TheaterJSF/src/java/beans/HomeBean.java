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
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;


@Named(value = "homeBean")
@SessionScoped
public class HomeBean implements Serializable{
    @EJB
    private theaterEJB theaterEJB;
    
    private Theater theater;
    
    //This is a list of all the values we utilize throughout the JSF pages for storage recollection of data
    private String movieTitle;
    private String imdbID;
    private String creditCard;
    private String name;
    private String numTickets;    
    private String selectedTime; 
    private String zip;
    private String theaterId;
    
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
    
    
    //Stores Zip data inputted by user in Home.xhtml 
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
    
    //Theaters.xhtml data
    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
    
    //Stores theaterId selected from Theaters.xhtml
    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }
    
    
    
    
    
    //Stores selected time selected from Showtimes.xhtml 
    public String getSelectedTime() {
        return selectedTime;
    }

    public void setSelectedTime(String selectedTime) {
        this.selectedTime = selectedTime;
    }
    
    
    
    
       
    //Stores selected movie title from Showtimes.xhtml 
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
    
    
    
    
    
    //Stores credit card information from Checkout.xhtml 
    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String CreditCard) {
        this.creditCard = CreditCard;
    }

    //Stores name input from Checkout.xhtml
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Stores amount of tickets from Checkout.xhtml
    public String getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(String numTickets) {
        this.numTickets = numTickets;
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
    
    //Returns the user selected theater's list of movies for showtimes.xhtml 
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
    
    //Return a list of movie times for Showtimes.xhtml to display
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
    
    public String getPrice(int tic){
        return "$" + (tic*10);
    }
}
