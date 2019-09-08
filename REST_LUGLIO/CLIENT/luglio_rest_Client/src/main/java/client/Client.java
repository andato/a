/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.util.List;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.client.WebClient;

/**
 *
 * @author francescafraioli
 */
public class Client {
    public static void main(String[] args) {
         WebClient client = WebClient.create("http://localhost:8080");
         
         
         //ESEGUIRE GET FILM E GET FILM BY ID UNO ALLA VOLTA
         //GET FILMS
         List<Movies> movies = client.path("movies").accept(MediaType.APPLICATION_XML).get(new GenericType<List<Movies>>(){});
         
         System.out.println(movies);
         
        
         //GET FILMS BY ID
         Movies movie = client.path("movies/1").accept(MediaType.APPLICATION_XML).get().readEntity(Movies.class);
         System.out.println(movie);

    }
   
}
