
package com.mycompany.luglio_2019;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.luglio_2019 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMovies_QNAME = new QName("http://luglio_2019.mycompany.com/", "getMovies");
    private final static QName _GetMovieById_QNAME = new QName("http://luglio_2019.mycompany.com/", "getMovieById");
    private final static QName _GetMoviesResponse_QNAME = new QName("http://luglio_2019.mycompany.com/", "getMoviesResponse");
    private final static QName _GetMovieByIdResponse_QNAME = new QName("http://luglio_2019.mycompany.com/", "getMovieByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.luglio_2019
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieById }
     * 
     */
    public GetMovieById createGetMovieById() {
        return new GetMovieById();
    }

    /**
     * Create an instance of {@link GetMovies }
     * 
     */
    public GetMovies createGetMovies() {
        return new GetMovies();
    }

    /**
     * Create an instance of {@link GetMoviesResponse }
     * 
     */
    public GetMoviesResponse createGetMoviesResponse() {
        return new GetMoviesResponse();
    }

    /**
     * Create an instance of {@link GetMovieByIdResponse }
     * 
     */
    public GetMovieByIdResponse createGetMovieByIdResponse() {
        return new GetMovieByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://luglio_2019.mycompany.com/", name = "getMovies")
    public JAXBElement<GetMovies> createGetMovies(GetMovies value) {
        return new JAXBElement<GetMovies>(_GetMovies_QNAME, GetMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://luglio_2019.mycompany.com/", name = "getMovieById")
    public JAXBElement<GetMovieById> createGetMovieById(GetMovieById value) {
        return new JAXBElement<GetMovieById>(_GetMovieById_QNAME, GetMovieById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://luglio_2019.mycompany.com/", name = "getMoviesResponse")
    public JAXBElement<GetMoviesResponse> createGetMoviesResponse(GetMoviesResponse value) {
        return new JAXBElement<GetMoviesResponse>(_GetMoviesResponse_QNAME, GetMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://luglio_2019.mycompany.com/", name = "getMovieByIdResponse")
    public JAXBElement<GetMovieByIdResponse> createGetMovieByIdResponse(GetMovieByIdResponse value) {
        return new JAXBElement<GetMovieByIdResponse>(_GetMovieByIdResponse_QNAME, GetMovieByIdResponse.class, null, value);
    }

}
