/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;
import static jdk.nashorn.internal.runtime.PropertyDescriptor.GET;

/**
 *
 * @author francescafraioli
 */

public class Repository {
   private Map<Integer, Movies> movies = new HashMap<>();
   private Map<Integer, Director> directors = new HashMap<>();
   
   public Repository(){
       Movies m1 = new Movies();
       Movies m2 = new Movies();
       Movies m3 = new Movies();
       
       m1.setId(1);
       m1.setTitle("titanic");
       m1.setYear(1900);
       
       
       m2.setId(2);
       m2.setTitle("it");
       m2.setYear(1700);
       
       
       m3.setId(3);
       m3.setTitle("et");
       m3.setYear(2000);
       
       
       Director d1 = new Director();
       Director d2 = new Director();
       Director d3 = new Director();
       
       d1.setId(1);
       d1.setName("Emma");
       d1.setYearOfBirth(1980);
       d1.addMovie(m1);
       m1.setDirector(d1);
       d1.addMovie(m2);
       m2.setDirector(d1);
       
       
       d2.setId(2);
       d2.setName("Ciro");
       d2.setYearOfBirth(1990);
       d2.addMovie(m3);
       m3.setDirector(d2);
       
       
       d3.setId(3);
       d3.setName("Ele");
       d3.setYearOfBirth(1950);
       
       
       movies.put(1, m1);
       movies.put(2, m2);
       movies.put(3, m3);
       directors.put(1, d1);
       directors.put(2, d2);
       directors.put(3, d3); 
   }
   
   @GET
   @Path("movies")
   @Produces(MediaType.APPLICATION_XML)
   public List<Movies> getMovies(){
       List<Movies> res = new ArrayList<>();
       for(Movies elem : this.movies.values()){
           res.add(elem);
       }
       return res;
   }
   
    @GET
    @Path("movies/{movieId}")
    @Produces(MediaType.APPLICATION_XML)
    public Response getMoviesById(@PathParam("movieId") int movieID){
        for(Map.Entry<Integer, Movies> elem : this.movies.entrySet()){
            if(elem.getKey() == movieID) return Response.ok(elem.getValue()).build();
        }
        return Response.status(404).build();
    }
  
}


 