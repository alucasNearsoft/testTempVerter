/*
 * TempVerter describes a Service Endpoint Interface (SEI), which is a Java interface that exposes a web
 * service interface’s operations in terms of abstract Java methods. Clients communicate with SOAP-based
 * web services via their SEIs.
 * TempVerter is declared to be an SEI via the @WebService annotation
 */
package ca.tutortutor.tv;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TempVerter {
	// Because only public methods can be declared in interfaces, the public
	// reserved word isn’t necessary when declaring c2f() and f2c(). These
	// methods are implicitly public.

	// Although @WebMethod is not essential in this example, its presence
	// reinforces the fact that the annotated method exposes a web service
	// operation.

	@WebMethod
	double c2f(double degrees);

	@WebMethod
	double f2c(double degrees);
}