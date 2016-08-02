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
import entity.Author;
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
    

    
    //public List<Theater> findTheaters(String zip){
      //  this.zip = zip;
        //return theaterEJB.findTheaters(zip);
   // }
    
    
}
