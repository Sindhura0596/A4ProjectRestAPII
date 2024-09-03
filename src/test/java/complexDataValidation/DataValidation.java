package complexDataValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class DataValidation {
	
	@Test
	public void complexDataValidation()
	{
		String expectedData = "Ramos";
		baseURI ="https://reqres.in/";
		Response resp = when().get("api/users");
		List<Object> allData = resp.jsonPath().get("data");
		Iterator<Object> itr = allData.iterator();
		while(itr.hasNext())
		{
			String actualInfo = itr.next().toString();
			if(actualInfo.contains(expectedData))
			{
				System.out.println(actualInfo);
			}
		}
		
		
		
		
		
	}

}
