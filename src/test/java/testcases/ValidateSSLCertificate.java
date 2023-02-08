package testcases;

import static io.restassured.RestAssured.given;

import javax.net.ssl.SSLException;

import org.testng.annotations.Test;

public class ValidateSSLCertificate {

	final static String url = "https://www.77bugs.pl/";

	@Test(expectedExceptions = { SSLException.class })
	public static void validateCertificatePresence() {

		given().get(url).then();

	}
}