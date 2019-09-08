package driver;


import driver.DatabaseClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francescafraioli
 */
public class SoapOperation {
    
    public static void main(String[] args) {
        DatabaseClass db = new DatabaseClass();
        db.getRows("SELECT * FROM MOVIES");
    }
}
