package ressourcen;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;


@Path("/User")
public class User {

  public xml_worker xmlWorker;

    public User() throws JAXBException{
		this.xmlWorker = new xml_worker();
	}
    
    
    @GET 
	@Produces("Userinformation/xml")
	public User getUserliste() throws JAXBException, SAXException{
    	return this.xmlWorker.unmarshalUserinformation();
	}
    
    @POST
    @Path("/User")
    @Consumes(MediaType.APPLICATION_XML)
	public String postUser(
			@QueryParam("user") String user) {

		if (user == null) {
			throw new IllegalArgumentException("User darf nicht leer sein.");
		}
		
		return user;
	}
    

	@GET 
	@Path("/User/{id}")
	@Produces("Userinformation/xml")
	public User get(@PathParam("id") int S_id) throws JAXBException, SAXException{
	
		User us = new User();

		User returnusr = new User();
		User u = this.xmlWorker.unmarshalusr();

	
				return u;
		
	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_XML)
	public String postUserinformation(
		@QueryParam("user_id") String user_id) {

	if (user_id == null) {
		throw new IllegalArgumentException("User Anzahl darf nicht Null sein.");
	}
	
	return user_id;
	}


	@DELETE
	@Path("/delete")
	public User deleteUser() {

		return null;
	}
}


