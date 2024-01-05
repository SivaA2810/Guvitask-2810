package domainA.createReqBody;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExternalFile {

	// De-serialization using external file description 
	
	@Test
	public void create_request_body_using_external_body() throws IOException{
	
	File file = new File("sivaone.json");
		
	given()
		.contentType("application/json")
		.baseUri("http://localhost:3000/")
		.basePath("employees")
		.body(file)
	.when()
		.post() 
	.then()
		.statusCode(201)
		.log()
		.all();
	} 
}
