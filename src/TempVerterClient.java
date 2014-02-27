/*
 * A client for accessing the TempVerter web service
 */
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ca.tutortutor.tv.TempVerter;

public class TempVerterClient {

	public static void main(String[] args) throws Exception {
		// URL instance that identifies the web service’s WSDL file
		URL url = new URL("http://localhost:9901/TempVerter?wsdl");
		// QName instance that identifies the endpoint’s qualified service name
		QName qname = new QName("http://tv.tutortutor.ca/",
				"TempVerterImplService");
		// Return a Service instance that provides a client view of a web
		// service.
		Service service = Service.create(url, qname);
		qname = new QName("http://tv.tutortutor.ca/", "TempVerterImplPort");
		// Return a proxy for communicating with the web service via its
		// endpoint
		// The qualified name passed to portName identifies the endpoint’s
		// qualified port name which identifies the web service interface whose
		// operations are to be accessed —there is only one interface in this
		// example.
		// The java.lang.Class instance passed to serviceEndpointInterface
		// identifies the TempVerter SEI.
		TempVerter tv = service.getPort(qname, TempVerter.class);
		// TempVerter tv = service.getPort(TempVerter.class);
		// the returned object is used to invoke the c2f() and f2c()
		// methods with arguments representing body temperature in degrees
		// Celsius and the boiling point of
		// water in degrees Fahrenheit
		System.out.println(tv.c2f(37.0));
		System.out.println(tv.f2c(212.0));
	}

}
