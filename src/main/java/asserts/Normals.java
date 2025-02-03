package asserts;

import org.testng.asserts.SoftAssert;

public class Normals {
    
	public static void login()
	{
		System.out.println("Login in done");
	}
	public static void main(String[] args) {
		
		SoftAssert sa = new SoftAssert();
		
		boolean button = false;
		sa.assertTrue(button);
		
		login();
		sa.assertAll();
	}
}
