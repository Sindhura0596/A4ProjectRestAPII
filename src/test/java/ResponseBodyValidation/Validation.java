package ResponseBodyValidation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClasses.CreatePojo;

public class Validation {
	
	@Test
	public void m1() {
	
		String expectedInfo = "Raja";
		baseURI = "https://reqres.in/";
		CreatePojo cp = new CreatePojo("Raja", "manager");
		Response resp = given().body(cp).contentType(ContentType.JSON).when().post("api/users");
		String actualinfo = resp.jsonPath().get("name");
		Assert.assertEquals(actualinfo, expectedInfo);
		System.out.println("assertion pass!!!");
		
		
		
	}

}
