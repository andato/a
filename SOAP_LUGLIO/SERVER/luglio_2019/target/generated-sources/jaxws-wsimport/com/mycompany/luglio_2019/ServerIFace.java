
package com.mycompany.luglio_2019;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServerIFace", targetNamespace = "http://luglio_2019.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServerIFace {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovies", targetNamespace = "http://luglio_2019.mycompany.com/", className = "com.mycompany.luglio_2019.GetMovies")
    @ResponseWrapper(localName = "getMoviesResponse", targetNamespace = "http://luglio_2019.mycompany.com/", className = "com.mycompany.luglio_2019.GetMoviesResponse")
    @Action(input = "http://luglio_2019.mycompany.com/ServerIFace/getMoviesRequest", output = "http://luglio_2019.mycompany.com/ServerIFace/getMoviesResponse")
    public List<String> getMovies();

}
