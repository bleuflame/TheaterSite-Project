/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author JamesEich
 */
import java.io.Serializable;
import java.util.logging.Logger;
 
public class Theater_MoviesID implements Serializable {
 

    private String theaterId;
    private String imdbId;  
    private String movieTime;
 
    public Theater_MoviesID() {
    }

    public Theater_MoviesID(String theaterId, String imdbId, String movieTime) {
        this.theaterId = theaterId;
        this.imdbId = imdbId;
        this.movieTime = movieTime;
    }

    public String getTheaterId() {
        return theaterId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getMovieTime() {
        return movieTime;
    }
 

        
        
        
        
 
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + idEmployee;
		return result;
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeId other = (EmployeeId) obj;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
			return false;
		if (idEmployee != other.idEmployee)
			return false;
		return true;
	}
 */
	
	
}