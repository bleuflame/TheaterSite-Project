/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author JamesEich
 */
@Entity
@IdClass(Theater_MoviesID.class)
@Table(name="Theater_Movies")
@NamedQueries({   
    @NamedQuery(name = "Theater_Movies.findAll", query = "SELECT a FROM Theater_Movies a"),
    //Important
    @NamedQuery(name = "Theater_Movies.findByImdbId", query = "SELECT a FROM Theater_Movies a WHERE a.imdbId = :imdbId"),
    @NamedQuery(name = "Theater_Movies.findByTheaterId", query = "SELECT a FROM Theater_Movies a WHERE a.theaterId = :theaterId"),
    @NamedQuery(name = "Theater_Movies.findTheaterMovies", query = "SELECT DISTINCT a FROM Theater_Movies a, Theater u WHERE a.theaterId = :theaterId")})


//Fix later

public class Theater_Movies implements Serializable {
    private static final long serialVersionUID = 1L;
//-----
    
    /*
        create table Theater_Movies (
          imdbId varchar(15) not null,
          theaterId integer not null,
          movieTime varchar(15) not null,
          constraint pkTheater_Movies primary key (imdbId, theaterId, movieTime)
                );

    */
    
    private Theater theater;
    
    @Id //Where?
    @NotNull
    @Column(name="theaterId")
    private String theaterId;
    
    @Id
    @Size(max = 15)
    @NotNull
    @Column(name="imdbId")
    private String imdbId;  
    
    @Id
    @Size(max = 15)
    @NotNull
    @Column(name="movieTime")
    private String movieTime;
    

//-----
    
  //  @ManyToOne
    //@JoinColumn(name="movies")
    //private Theater _theater;
    
    @ManyToOne
    @JoinColumn(name = "theaterId", nullable = false)
    public Theater getTheater() {
        return this.theater;
    }

	public void setTheater(Theater theater) {
		this.theater = theater;
	}
    
    
    public Theater_Movies(){
    }

    //Getters and setters    
    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    

    
    
    
    
    
   /* 
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterId != null ? theaterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the authorId fields are not set
        if (!(object instanceof Theater_Movies)) {
            return false;
        }
        Theater_Movies other = (Theater_Movies) object;
        if (!this.theaterId.equals(other.theaterId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theater[ id=" + theaterId + " ]";
    }*/
    
}
