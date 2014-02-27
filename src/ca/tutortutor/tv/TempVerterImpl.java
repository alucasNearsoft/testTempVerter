/*
 * Describes a Service Implementation Bean (SIB), which provides an implementation
 * of the SEI. This class is declared to be a SIB via the @WebService(endpointInterface =
 * "ca.tutortutor.tv.TempVerter") annotation. The endpointInterface element connects this SIB to its
 * SEI, and is necessary to avoid undefined port type errors when running the client application
 */
package ca.tutortutor.tv;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "ca.tutortutor.tv.TempVerter")
public class TempVerterImpl implements TempVerter {

	// The SIB’s method headers aren’t annotated @WebMethod because this
	// annotation is typically used in the context of the SEI.
	@Override
	// @WebMethod
	public double c2f(double degrees) {
		return degrees * 9.0 / 5.0 + 32;
	}

	@Override
	// @WebMethod
	public double f2c(double degrees) {
		return (degrees - 32) * 5.0 / 9.0;
	}

}
