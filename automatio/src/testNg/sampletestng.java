package testNg;

import org.testng.annotations.Test;

public class sampletestng {
	@Test(priority=0)
	public void firsttest() {
		System.out.println("first");
	}
	@Test(priority=1,enabled=false)
	public void secondtest() {
		System.out.println("second");
	}
	@Test(priority=2)
	public void thirdtest() {
		System.out.println("third");
	}
	@Test(priority=3)
	public void fourthtest() {
		System.out.println("four");
	}
}
