package com.mycompany.luglio_2019;


import com.mycompany.luglio_2019.ServerIFace;
import driver.DatabaseClass;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francescafraioli
 */


@WebService(endpointInterface = "com.mycompany.luglio_2019.ServerIFace")
public class ServerImpl implements ServerIFace{

    @Override
    public List<String> getMovies() {
        DatabaseClass db = new DatabaseClass();
        List<String> res = new ArrayList<>();
        String query = "SELECT m.id, m.title "
                + "FROM MOVIES m "
                + "LEFT JOIN DIRECTORS d ON m.DIRECTORID = d.ID";
        List<String> res_json = db.getRows(query);
        
        for(String elem : res_json){
            JSONParser g = new JSONParser();
            try{
                JSONObject json = (JSONObject) g.parse(elem);
                String id = (String)json.get("ID");
                String titolo = (String)json.get("TITLE");
                String res_str = String.format("ID: %s - TITOLO: %s", id, titolo);
                res.add(res_str);
            }catch(ParseException e){
                System.out.println("errore nel parse");
            }
        }
        
        return res;
    }

    @Override
    public String getMovieById(int id) {
        DatabaseClass db = new DatabaseClass();
        String res = "";
        String query = String.format(
                "select m.id as FILM_ID, m.TITLE, m.YEAR_FILM, d.id as DIRECOTR_ID, d.\"NAME\", d.YEAROFBIRTH "
                + "FROM MOVIES m "
                + "LEFT JOIN DIRECTORS d ON m.DIRECTORID = d.ID "
                + "WHERE m.ID = %d", id);
        System.out.println(query);
        List<String> res_json = db.getRows(query);
        //System.out.println(res_json);
        res = res_json.get(0);
        return res;
    }
    
    
    
}
