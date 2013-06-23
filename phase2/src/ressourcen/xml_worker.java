package ressourcen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;


public class xml_worker {
	JAXBContext User;
	JAXBContext Quizze;
	

	/**
	 * Kontext fuer marshal und unmarshall
	 * @throws JAXBException
	 */
	public xml_worker() throws JAXBException{
		this.User = JAXBContext.newInstance(generate.Userinformation.class);
		this.Quizze = JAXBContext.newInstance(generate.Quiz.class);
		
	}


	/**
	 * Methode zum Auslesen aus der App-XML-Datei
	 * @return Userinformation
	 * @throws JAXBException
	 */
	public User unmarshalModul() throws JAXBException{
		Unmarshaller unmarshal = User.createUnmarshaller();
		User userinformation = (User) unmarshal.unmarshal(new File("src/xml/Userinformation.xml"));
		
		return userinformation;
	}

	/**
	 * Methode zum Schreiben in die App-XML-Datei
	 * @param Quiz
	 * @throws JAXBException
	 * @throws SAXException
	 * @throws FileNotFoundException
	 */
	public void marshalusr(User usr) throws JAXBException, SAXException, FileNotFoundException{
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("src/Quiz.xsd"));
		Marshaller marshal = User.createMarshaller();
		marshal.setSchema(schema);
        marshal.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		FileOutputStream file = new FileOutputStream("src/xml/Quiz.xml");
		marshal.marshal(usr, file);
	}


	/**
	 * Methode zum Auslesen aus der App-XML-Datei
	 * @return Quiz
	 * @throws JAXBException
	 */
	public Quizze unmarshalQuizze() throws JAXBException{
		Unmarshaller unmarshal = Quizze.createUnmarshaller();
		Quizze quiz = (Quizze) unmarshal.unmarshal(new File("src/xml/Quiz.xml"));

		return quiz;
	}

	/**
	 * Methode zum Schreiben in die App-XML-Datei
	 * @param Quizliste
	 * @throws JAXBException
	 * @throws SAXException
	 * @throws FileNotFoundException
	 */
	public void marshalQuiz(Quizze Quiz) throws JAXBException, SAXException, FileNotFoundException{
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("src/Quiz.xsd"));
		Marshaller marshal = Quizze.createMarshaller();
		marshal.setSchema(schema);
		marshal.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		FileOutputStream file = new FileOutputStream("src/xml/Quiz.xml");
		marshal.marshal(Quiz, file);
	}


	public User unmarshalUserinformation() {
		// TODO Auto-generated method stub
		return null;
	}


	public User unmarshalusr() {
		// TODO Auto-generated method stub
		return null;
	}


	public Quizze unmarshalQuiz() {
		// TODO Auto-generated method stub
		return null;
	}

	
}