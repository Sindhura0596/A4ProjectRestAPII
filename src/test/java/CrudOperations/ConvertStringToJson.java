package CrudOperations;
import static io.restassured.RestAssured.baseURI;
import  static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ConvertStringToJson {
	@Test
	public void readData()
	{
		baseURI = "https://reqres.in/";
		Response resp = when().get("api/unknown/2");
		String data = resp.asString();
		JsonPath js = new JsonPath(data);
		int id = js.getInt("data.id");
		System.out.println(id);
	}
}
