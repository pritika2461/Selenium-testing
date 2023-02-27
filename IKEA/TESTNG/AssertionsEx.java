package Capgemini.IKEA.TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsEx {
	
	
	@Test
	public void softwassert() {
		
	SoftAssert softassertion = new SoftAssert();
	softassertion.assertTrue(false);
	System.out.println("Softassert method was executed");
	
	}
	
	
	@Test
	public void hardassert() {
	Assert.assertTrue(false);
	System.out.println("hard method was executed");
	
	}
	
	
	
	

}
