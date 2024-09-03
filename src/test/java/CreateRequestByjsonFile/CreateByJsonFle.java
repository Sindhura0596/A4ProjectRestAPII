package CreateRequestByjsonFile;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateByJsonFle {
	
	@Test
	public void createByJsonFile()
	{
		
		File f = new File(".\\details.json");
		given().body(f).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
	}

}
