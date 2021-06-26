package testNg;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramertisation {
	@Test
    @Parameters("nidhin")
	public void print(String x)
	{
		System.out.println(x);
	}

}
