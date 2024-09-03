package CreateRequestByJsonObject;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateRequestByJsonObject {
	
	@Test
	public void createReq()
	{
		
		JSONObject obj = new JSONObject();
		obj.put("name", "Suresh");
		obj.put("job", "manager");
		given().body(obj).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
	}

}
