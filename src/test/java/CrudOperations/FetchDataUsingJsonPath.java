package CrudOperations;

import static io.restassured.RestAssured.baseURI;
import  static io.restassured.RestAssured.when;
import org.testng.annotations.Test;
import  io.restassured.response.Response;

public class FetchDataUsingJsonPath {
	
	@Test
	public void fetchDataUsingJsonPath()
	{
		
		baseURI = "https://reqres.in/";
		Response resp = when().get("api/unknown/2");
		
		// for single data
		
		String obj = resp.jsonPath().get("data");
		System.out.println(obj);
	}

}
