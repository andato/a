package com.mycompany.luglio_2019;


import java.util.List;
import javax.jws.WebService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francescafraioli
 */
@WebService
public interface ServerIFace {
    public List<String> getMovies();
    
    public String getMovieById(int id);
    
}
