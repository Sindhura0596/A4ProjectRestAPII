package ResponseBodyValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClasses.PojoClassForLogin;

public class LoginUsingPojoClass {
	@Test
	public void login() {
	//URl-https://reqres.in/api-docs/#/default/post_register
		String expectedInf = "sindhura@gmail.com";
		baseURI = "https://reqres.in/api-docs/#/";
		PojoClassForLogin pcl = new PojoClassForLogin("sindhura", "sindhura@gmail.com", "sindhura123");
		Response resp = given().body(pcl).contentType(ContentType.JSON).when().post("default/post_register");
		String actualinf = resp.jsonPath().get("email");
		Assert.assertEquals(actualinf, expectedInf);
		System.out.println("assertion pass!!!");

}
}