/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import XMLparsing.DOMparsing;
import XMLparsing.Movie;
import entity.Theater;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ozbirn
 */
@Stateless
public class theaterEJB {
    @PersistenceContext(unitName = "TheaterJSF-PU")
    private EntityManager em;

    public void persist(Object object) {
        
        em.persist(object);
    }
    
        
    //Fetches the theaters with the user given zipcode
    public List<Theater> getTheaters(String zip)
    {
        System.out.println("Getlist " + zip);
        return em.createNamedQuery("Theater.findByZip", Theater.class)
                .setParameter("zip", zip).getResultList();
    }
    
    
    public List<Movie> searchMovies(String theaterId){
        
        
        List<String> imdbtags = (List<String>)em.createNativeQuery("SELECT DISTINCT imdbId FROM Theater_Movies WHERE theaterId = (?1)")
                      .setParameter(1, theaterId)
                      .getResultList(); 
        
        return DOMparsing.parseMovies(imdbtags);
        
    }
    
    
    
    /*
    List<Customer> customers = (List<Customer>)em.createNativeQuery
                              


            ("SELECT * FROM customers", jpqlexample.entities.Customer.class)
                              .getResultList(); 
        Iterator i = customers.iterator();
        Customer cust;
        out.println("Customers: " + "<br/>");
        while (i.hasNext()) {
            cust = (Customer) i.next();
            out.println(cust.getCust_name() +"<br/>");
        }
    
    */
    
    
    
    
    
    
    //public List<Theater> findTheaters(String zip){
    //    return em.createNamedQuery("Theater.findByZip", Theater.class).setParameter("zip", zip).getResultList();
    //}

    //Currently does nothing but persist. 
    //Need to add functions here for JSF to query data from the database
    
    //Also need to work on DOMparsing. Gather list of movies by imdbId, put external Data information 
        //in movies List, use data in JSF
    
    /*

    public List<Author> findAllAuthors()
    {
        return em.createNamedQuery("Author.findAll", Author.class).getResultList(); 
    }
                  
    public Author getAuthor(String authorId)
    {
        return em.createNamedQuery("Author.findByAuthorId", Author.class)
                    .setParameter("authorId", authorId)
                .getSingleResult();
    }
    
    public List<Book> getAuthorBooks(String authorId)
    {
        return em.createNamedQuery("Book.findPublishedBooks", Book.class)
                .setParameter("authorId", authorId)
                .getResultList();
    }*/

    public List<String> getMovieTimes(String theaterId, String imdbId) {
        return (List<String>)em.createNativeQuery("SELECT movieTime FROM Theater_Movies WHERE theaterId = (?1) AND imdbId = (?2)")
                      .setParameter(1, theaterId).setParameter(2, imdbId)
                      .getResultList(); 
    }
}
