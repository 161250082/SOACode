package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-06-26T19:58:16.307+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "MyService", 
                  wsdlLocation = "http://115.159.202.18:3323/ServiceHello?wsdl",
                  targetNamespace = "http://service/") 
public class MyService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service/", "MyService");
    public final static QName HelloServicePort = new QName("http://service/", "HelloServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://115.159.202.18:3323/ServiceHello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MyService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://115.159.202.18:3323/ServiceHello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MyService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MyService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MyService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MyService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloServiceInterface
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloServiceInterface getHelloServicePort() {
        return super.getPort(HelloServicePort, HelloServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloServiceInterface
     */
    @WebEndpoint(name = "HelloServicePort")
    public HelloServiceInterface getHelloServicePort(WebServiceFeature... features) {
        return super.getPort(HelloServicePort, HelloServiceInterface.class, features);
    }

}
