
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
 * @author JamesEich
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
    
    //Retrieves Movies from distinct theater
    public List<Movie> searchMovies(String theaterId){
        List<String> imdbtags = (List<String>)em.createNativeQuery("SELECT DISTINCT imdbId FROM Theater_Movies WHERE theaterId = (?1)")
                      .setParameter(1, theaterId)
                      .getResultList(); 
        
        return DOMparsing.parseMovies(imdbtags);
    }
   
    //Retrieves Movies times from distinct theater and distinct movies
    public List<String> getMovieTimes(String theaterId, String imdbId) {
        return (List<String>)em.createNativeQuery("SELECT movieTime FROM Theater_Movies WHERE theaterId = (?1) AND imdbId = (?2)")
                      .setParameter(1, theaterId).setParameter(2, imdbId)
                      .getResultList(); 
    }
}
