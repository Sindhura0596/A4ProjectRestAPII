package CrudOperations;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateAndFetch {
	@Test
	public void modifiAndRead()
	{
	baseURI = "https://reqres.in/";
	
	// REQUEST for update

	JSONObject obj = new JSONObject();
	obj.put("name", "Sindhura");
	obj.put("job", "Qa");
	
	given().body(obj).contentType(ContentType.JSON).
	when().put("api/users/2").then().assertThat().statusCode(200).log().all();
	
	
	//Request to read the data in different formats
	
	Response resp = when().get("api/users/2");
	
	String data = resp.getBody().asString();
	System.out.println(data);
	System.out.println("------------------------------------------------------------");
	//OR
	String data1 = resp.asString();
	System.out.println(data1);
	System.out.println("------------------------------------------------------------");
	
	//same thing to print in JSON format
	System.out.println(resp.prettyPrint());
	//Same as prettyprint
	System.out.println("------------------------------------------------------------");
	System.out.println(resp.prettyPeek());
	
	// this 3 methods help us to validate the response head
	
	System.out.println("------------------------------------------------------------");
	System.out.println(resp.getStatusCode());
	System.out.println("------------------------------------------------------------");
	System.out.println(resp.getContentType());
	System.out.println("------------------------------------------------------------");
	System.out.println(resp.getTime());

	}
}
