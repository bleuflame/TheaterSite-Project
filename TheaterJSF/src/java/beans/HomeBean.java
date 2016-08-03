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
    
    
}
