/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Theater;
import entity.Theater_Movies;
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
