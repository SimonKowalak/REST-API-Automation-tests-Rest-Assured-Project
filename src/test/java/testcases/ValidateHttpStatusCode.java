package testcases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateHttpStatusCode {

	final static String url = "http://www.77bugs.pl";
	final static int successStatusCode = 200;

	public static void main(String args[]) {
		validateStatusCode200();
	}

	@Test
	public static void validateStatusCode200() {
		int statusCode = given().when().get(url).getStatusCode();
		
		Assert.assertEquals(statusCode, successStatusCode);
	}

}