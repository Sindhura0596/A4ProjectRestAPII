package CreateRequestByPojo;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClasses.CreatePojo;

public class CreateRequest {

	@Test
	public void createReq()
	{
		
		CreatePojo cp = new CreatePojo("sindhura", "QA");
		given().body(cp).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
		
		
	}
	
}
