package minirestwebservice;

import com.sun.jersey.api.client.*;


public class client {

	public static void main(String[] args) {
		String url = "http://localhost:7160";

	      url = url + "/Quizze";

	      WebResource wrs = Client.create().resource(url);

	      System.out.println( wrs.accept("application/xml").get(String.class));
	}
}