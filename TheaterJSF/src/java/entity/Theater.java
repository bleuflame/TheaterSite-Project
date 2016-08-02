/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author JamesEich
 */
@Entity
@Table(name="Theater")
@NamedQueries({   
    @NamedQuery(name = "Theater.findAll", query = "SELECT a FROM Theater a"),
    //Important
    @NamedQuery(name = "Theater.findByZip", query = "SELECT a FROM Theater a WHERE a.zip = :zip"), 
    @NamedQuery(name = "Theater.findById", query = "SELECT a FROM Theater a WHERE a.theaterId = :theaterId")})

public class Theater implements Serializable {
  //  private static final long serialVersionUID = 1L;
//-----
    private Set<Theater_Movies> theater_Movies = new HashSet<Theater_Movies>(0);

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name="theaterId")
    private String theaterId;
    
    @Size(max = 50)
    @NotNull
    @Column(name="theater_name")
    private String theater_name;  
    
    @Size(max = 5)
    @NotNull
    @Column(name="zip")
    private int zip;

    @Size(max = 100)
    @NotNull
    @Column(name="address")
    private String address;
    
//-----
   /* @OneToMany(mappedBy="movies")
    private Set<Theater_Movies> movies;
    */
    @OneToMany(mappedBy = "theater")
    public Set<Theater_Movies> getTheater_Movies() {
        return this.theater_Movies;
    }
    
    public void setTheater_Movies(Set<Theater_Movies> theater_Movies){
      theater_Movies =  this.theater_Movies;
    }
    
    
    
    public Theater(){
    }

    //Getters and setters    
    public Theater(String theaterId){
        theaterId = this.theaterId;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheater_name() {
        return theater_name;
    }

    public void setTheater_name(String theater_name) {
        this.theater_name = theater_name;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
    
    
    
  
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterId != null ? theaterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the authorId fields are not set
        if (!(object instanceof Theater)) {
            return false;
        }
        Theater other = (Theater) object;
        if (!this.theaterId.equals(other.theaterId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theater[ id=" + theaterId + " ]";
    }
    
}
