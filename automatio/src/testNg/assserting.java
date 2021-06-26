package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assserting {
	String name="nidhin";
	boolean s=false;
	@Test
	public void findeual() {
		//Assert.assertEquals(name, "nidhin");
		Assert.assertTrue(s,"good");
	}

}
