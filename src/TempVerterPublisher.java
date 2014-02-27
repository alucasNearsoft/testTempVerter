/*
 * TempVerterPublisher application that is published in the context of the default
lightweight HTTP server
 */
import javax.xml.ws.Endpoint;

import ca.tutortutor.tv.TempVerterImpl;

public class TempVerterPublisher {

	public static void main(String[] args) {
		// The address parameter identifies the URI assigned to the web service.
		// I’ve chosen to publish this web service on the local host by
		// specifying
		// localhost (equivalent to IP address 127.0.0.1) and port number 9901
		// (which is most likely available).
		// Also, I’ve arbitrarily choosen /TempVerter as the publication path.
		// The implementor parameter identifies
		// an instance of TempVerter’s SIB.
		Endpoint.publish("http://localhost:9901/TempVerter",
				new TempVerterImpl());
	}
}
