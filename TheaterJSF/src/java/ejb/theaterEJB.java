/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

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
}
