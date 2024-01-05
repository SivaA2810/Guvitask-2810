package domainA.createReqBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Pojo_C_pagethree {

	
	@Test
	public void exutionM() {
		
		
		Pojo_A_pageone data = new Pojo_A_pageone();
		data.setFirstname("shanmugan");
		data.setLastname("shiva");
		data.setLocation("thiruthanigai");
		data.setCompany("education tech");
		
		String languageskills[]= {"java","phython"};
		String frameworkskills[]= {"POM","Datadriven","testng","junit","cucumber"};
		String toolsskills[]= {"jira","github","jenkins","postman"};	
		data.setLanguageskills(languageskills);
		data.setFrameworkskills(frameworkskills);
		data.setToolsskills(toolsskills);

		
		given()
		.contentType("application/json")
		.baseUri("http://localhost:3000/")
		.basePath("employees")
		.body(data)
	.when()
		.post()
	.then()
		.statusCode(201)
		.body("firstname",equalTo("shanmugan"))
		.body("lastname",equalTo("shiva"))
		.body("location",equalTo("thiruthanigai"))
		.body("company",equalTo("education tech"))
		.body("frameworkskills[1]",equalTo("Datadriven"))
		.body("toolsskills[3]",equalTo("postman"))
		.log()
		.all();
		
		
	}
	
	
}
