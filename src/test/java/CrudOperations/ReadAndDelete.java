package CrudOperations;
import static io.restassured.RestAssured.*;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

public class ReadAndDelete {

	@Test
	public void requestChaining()
	{
		baseURI = "https://reqres.in/";
		
		//Request 1:  read all the data
		
		when().get("api/users").then().assertThat().statusCode(200).log().all();
		System.out.println("----------------------------------------------------------------------------------------------");
		
		//Request 2 : read only id number
		
		int id = when().get("api/users").jsonPath().get("data[0].id");
		System.out.println(id);
		System.out.println("----------------------------------------------------------------------------------------------");

		
		//Request 3: read all details about id number
		
		when().get("api/users/"+id).then().assertThat().statusCode(200).log().all();
		System.out.println("----------------------------------------------------------------------------------------------");

		
		//Request 4: delete id number 1 details
		
		when().delete("api/users/"+id).then().assertThat().statusCode(204).log().all();
		System.out.println("----------------------------------------------------------------------------------------------");

		
		

	}
	
}
