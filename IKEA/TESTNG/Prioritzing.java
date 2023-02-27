package Capgemini.IKEA.TESTNG;

import org.testng.annotations.Test;

public class Prioritzing {
	
	
	
	// testcase 1
	
		@Test( priority = 0)
		
		public void testcase1() {
			
			System.out.println("In testcase 1");
			
			
		}
		
		// testcase 2
		
			@Test(priority = 1)
			
			public void testcase2() {
				
				System.out.println("In testcase 2");
				
		}
			
			
			// testcase 3
			
			@Test(priority = 3)
			
			public void testcase3() {
				
				System.out.println("In testcase 3");
				
		}
			
			// testcase 4
			
			@Test(priority = 5)
			public void testcase4() {
				
				System.out.println("In testcase 4");
				
		}
			
			// testcase 5
			
			@Test(priority = 4)
			
			public void testcase5() {
				
				System.out.println("In testcase 5");
				
		}
			

}
