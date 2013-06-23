package ressourcen;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import org.xml.sax.SAXException;


@Path("/Quizze")
public class Quizze{
	public xml_worker xmlWork;

    public Quizze() throws JAXBException{
		this.xmlWork = new xml_worker();
	}
    
    
    @GET 
	@Produces(MediaType.APPLICATION_XML)
	public Quizze getQuizze() throws JAXBException, SAXException{
		return this.xmlWork.unmarshalQuizze();
	}


	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_XML)
	public String postQuizze(
			@QueryParam("Quiz") String Quiz) {

		if (Quiz == null) {
			throw new IllegalArgumentException("Quiz darf nicht Null sein.");
		}
		
		return Quiz;
	}


	@GET
	@Path("/Quizze/{Quiz}")
	@Produces("Quiz/xml")
	public Quizze getQuiz() throws JAXBException, SAXException{
		return this.xmlWork.unmarshalQuizze();
	}
	
	@GET
	@Path("/Quizze/{Quiz}/{Question}")
	@Produces("Quiz/xml")
	public Quizze getQuestion() throws JAXBException, SAXException{
		return this.xmlWork.unmarshalQuizze();
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_XML)
	public String postQuestion(
			@QueryParam("Question") String Question) {

		if (Question == null) {
			throw new IllegalArgumentException("Question darf nicht Null sein.");
		}
		
		return Question;
	}
		
	
	@DELETE
	@Path("/delete")
	public Quizze deleteQuestion() {
	
		return null;

		}
	}
