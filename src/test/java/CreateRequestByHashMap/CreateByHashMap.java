package CreateRequestByHashMap;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateByHashMap {
		
	@Test
	public void createReq()
	{
		
		
		HashMap hp = new HashMap();
		hp.put("name", "raja");
		hp.put("job", "manager");
		
		given().body(hp).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users").then().assertThat().statusCode(201).log().all();
	}
	

	}

