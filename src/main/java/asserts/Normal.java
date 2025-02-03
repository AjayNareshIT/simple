package asserts;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Normal {
	public static void login()
	{
		System.out.println("login is done");
	}

	public static void main(String[] args) {
		 SoftAssert sa = new SoftAssert();
		 String actualText = "Welcome to FB";
		 String expectedText = "Welcome to FB page";
		//Assert.assertEquals(actualText, expectedText,"Validate the title");
		 sa.assertEquals(actualText, expectedText,"Validate the titles");
		 login();
		 sa.assertAll();
	}

}
