package testNg;

import org.testng.annotations.Test;

public class dependencees {
	
		@Test(enabled=true)
		public void highschool() {
			System.out.println("10");
		}
		@Test(dependsOnMethods="highschool")
		public void secondary() {
			System.out.println("12");
		}
		@Test(dependsOnMethods="secondary")
		public void degree() {
			System.out.println("college");
		}
		

}
