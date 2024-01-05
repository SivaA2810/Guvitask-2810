package domainA.createReqBody;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public class Hashmapmethod {
	
@Test
public void using_hashmap(){
	
	HashMap data = new HashMap();
	data.put("firstname", "karthic");
	data.put("lastname", "ananthan");
	data.put("location", "kulithalai");
	data.put("company", "hexaware");
	
	String languageskills[] = {"java","phython"};
	String frameworkskills[]= {"POM","Datadriven","testng","junit","cucumber"};
	String toolsskills[]= {"jira","github","jenkins","restassured"};	
	data.put("languageskills", languageskills);
	data.put("frameworkskills", frameworkskills);
	data.put("toolsskills", toolsskills);
	
	//http://localhost:3000/employees
	given()
		.contentType("application/json")
		.baseUri("http://localhost:3000/")
		.basePath("employees")
		.body(data)
	.when()
		.post()
	.then()
		.statusCode(201)
		.body("firstname",equalTo("karthic"))
		.body("lastname",equalTo("ananthan"))
		.body("location",equalTo("kulithalai"))
		.body("company",equalTo("hexaware"))
		.body("frameworkskills[1]",equalTo("Datadriven"))
		.body("toolsskills[3]",equalTo("postman"))
		.log()
		.all();
		
		
		
		
		
		
		
		
}
}
