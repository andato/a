/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.client_luglio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author francescafraioli
 */
public class client {
    public static void main(String[] args) {
        /*
        try { // Call Web Service Operation
            com.mycompany.luglio_2019.ServerImplService service = new com.mycompany.luglio_2019.ServerImplService();
            com.mycompany.luglio_2019.ServerIFace port = service.getServerImplPort();
            // TODO process result here
            java.util.List<java.lang.String> result = port.getMovies();
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        */
        
        try { // Call Web Service Operation
            com.mycompany.luglio_2019.ServerImplService service = new com.mycompany.luglio_2019.ServerImplService();
            com.mycompany.luglio_2019.ServerIFace port = service.getServerImplPort();
            // TODO initialize WS operation arguments here
            System.err.println("Inserisci l'id del film:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            int arg0 =  Integer.parseInt(input);
            // TODO process result here
            java.lang.String result = port.getMovieById(arg0);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
