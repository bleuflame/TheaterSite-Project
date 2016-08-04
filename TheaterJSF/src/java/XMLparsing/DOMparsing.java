/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLparsing;

/**
 *
 * @author JamesEich
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class DOMparsing{

    
    
    public static List<Movie> parseMovies(List<String> imdbtags){

      
      
      //imdbtags has all the movies for that theater
        List<Movie> movielist = new ArrayList<>();


        try {


            for (String imdbtag : imdbtags) {
                String url = "http://www.omdbapi.com/?i=" + imdbtag + "&plot=full&r=xml";

                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document document = db.parse(new URL(url).openStream());


              // Getting the movie node
                NodeList moviesNode = document.getElementsByTagName("movie");


        for(int x = 0; x < moviesNode.getLength(); x++)
	{                
            Movie movie = new Movie();
            Node node = moviesNode.item(x);
            
            if(node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		
		//Stores title, duration, and type. Times not needed.
		movie.setTitle(element.getAttribute("title"));
                movie.setRuntime(element.getAttribute("runtime"));
                movie.setGenre(element.getAttribute("genre"));
                movie.setRating(element.getAttribute("rating"));
                movie.setPlot(element.getAttribute("plot"));
                movie.setPoster(element.getAttribute("poster"));
                movie.setImdbrating(element.getAttribute("imdbRating"));
                movie.setImdbID(element.getAttribute("imdbID")); //Not needed to display
            }
            movielist.add(movie);
        }

      }//for loop
        
        
        
    }
    catch (SAXException | IOException | ParserConfigurationException e) {
      e.printStackTrace();
    }

        return movielist;
  }
  
     // public static void main(String[] args) {
        
        //Use this to make a Movie list
         //DOMparsing parser = new DOMparsing();
         //List<Movie> list = parser.parseMovies();
         
         /*System.out.println("Titles: ");
         for (Movie order : list)
             System.out.println(order.getPlot()); */
   // }
      
      
}
