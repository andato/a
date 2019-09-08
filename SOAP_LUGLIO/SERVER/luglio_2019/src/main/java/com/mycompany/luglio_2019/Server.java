/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luglio_2019;

import javax.xml.ws.Endpoint;

/**
 *
 * @author francescafraioli
 */
public class Server {
    public static void main(String[] args) {
        ServerImpl implementor = new ServerImpl();
        String address = "http://127.0.0.1:8080/Movies";
        Endpoint.publish(address, implementor);
        while (true) {}
    }
}
