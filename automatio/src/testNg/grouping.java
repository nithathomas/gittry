package testNg;

import org.testng.annotations.Test;

public class grouping {
	@Test
	public void apple1() {
		System.out.println("apple testing");
	}
	@Test
	public void apple2() {
		System.out.println("apple testing");

}
	@Test(groups= {"s"})
	public void moto1() {
		System.out.println("moto testing");
	}
	@Test(groups = {"s"})
	public void moto2()
	{
		System.out.println("moto testing");
	}
	@Test
	public void lenovo1() {
		System.out.println("lenovo testing");
	}
	@Test
	public void lenovo2() {
		System.out.println("lenovo testing");
	}
	@Test(groups = {"y"})
	public void vivo1() {
		System.out.println("vivo testing");
	}
	@Test(groups = {"y"})
	public void vivo2() {
		System.out.println("vivo testing");
	}
}
