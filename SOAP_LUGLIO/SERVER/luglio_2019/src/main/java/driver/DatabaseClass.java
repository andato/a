package driver;


import com.google.gson.JsonObject;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.api.scripting.JSObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author francescafraioli
 */
public class DatabaseClass {
    
    private static String dbURL = "jdbc:derby://localhost:1527/film;create=true;user=francesca;password=francesca";
    // jdbc Connection
    private Connection conn = null;

    public DatabaseClass() {
        this.createConnection();
    }
    
    private void createConnection()
    {
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            this.conn = DriverManager.getConnection(dbURL); 
            System.out.println("Connessione al DB avvenuta con successo");
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    public List<String> getRows(String query){ 
        //metodo che riceve la query
        List<String> res = new ArrayList<>(); //array vuoto perchè non so la dim
        try{
            System.out.println("query " + query);
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet results = stmt.executeQuery();
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            while(results.next())
            {
                JsonObject json = new JsonObject();
                
                for (int i=1; i<=numberCols; i++)
                {
                    String value = results.getString(i);
                    json.addProperty(rsmd.getColumnLabel(i), value);
                }
                res.add(json.toString());
            }
            results.close();
            stmt.close();
        }catch (SQLException sqlExcept){
            System.err.println("Errore nell'esecuzione della query");
        }
        return res;
    }
    
}
