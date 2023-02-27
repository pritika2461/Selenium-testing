package Capgemini.IKEA.TESTNG;

import org.testng.annotations.Test;

public class Grouping {
	
	// testcase 1
	
		@Test(groups = {"Regression"})
		
		public void testcase1() {
			
			System.out.println("In testcase 1");
			
			
		}
		
		// testcase 2
		
			@Test(groups = {"Regression"})
			
			public void testcase2() {
				
				System.out.println("In testcase 2");
				
		}
			
			
			// testcase 3
			
			@Test(groups = {"Regression"})
			
			public void testcase3() {
				
				System.out.println("In testcase 3");
				
		}
			
			// testcase 4
			
			@Test(groups = {"Sanity"})
			public void testcase4() {
				
				System.out.println("In testcase 4");
				
		}
			
			// testcase 5
			
			@Test(groups = {"Sanity"})
			
			public void testcase5() {
				
				System.out.println("In testcase 5");
				
		}
			

	
	
	
	
}
