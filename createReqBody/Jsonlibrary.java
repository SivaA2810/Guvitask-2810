package domainA.createReqBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Jsonlibrary {

	@Test
	public void create_request_body_using_org_JSON() {
		
		JSONObject data = new JSONObject();

		String languageskills[] = {"java","phython"};
		String frameworkskills[]= {"POM","Datadriven","testng","junit","cucumber"};
		String toolsskills[]= {"jira","github","jenkins","restassured"};	
		
		data.put("firstname", "abishekrajan");
		data.put("lastname", "malayalam");
		data.put("location", "thiruvarur");
		data.put("company", "omega");
		data.put("languageskills", languageskills);
		data.put("frameworkskills", frameworkskills);
		data.put("toolsskills", toolsskills);
	
	given()
		.contentType("application/json")
		.baseUri("http://localhost:3000/")
		.basePath("employees")
		.body(data)
	.when()
		.post()
	.then()
		.statusCode(201)
		.body("firstname",equalTo("abishekrajan"))
		.body("lastname",equalTo("malayalam"))
		.body("location",equalTo("thiruvarur"))
		.body("company",equalTo("omega"))
		.body("frameworkskills[1]",equalTo("Datadriven"))
		.body("toolsskills[3]",equalTo("restassured"))
		.log()
		.all();
		
	}
}
