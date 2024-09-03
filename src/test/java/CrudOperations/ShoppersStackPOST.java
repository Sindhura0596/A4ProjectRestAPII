package CrudOperations;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import pojoClasses.PojoClassForShoppersstack;

public class ShoppersStackPOST {
	@Test
	
	public void createReq()
	{
		
		PojoClassForShoppersstack pc = new PojoClassForShoppersstack("QA", "sindhura@gmail.com" , "https://swagger-ui.html#/Shopper%20Cart/addProductUserCartUsingPO");
		given().body(pc).contentType(ContentType.JSON)
		.when().post("https://www.shoppersstack.com/shopping/swagger-ui.html#/Shopper%20Profile/forgotPassWordUsingPOST")
		.then().assertThat().statusCode(201).log().all();
		
		
	}
	
		
	}
	
