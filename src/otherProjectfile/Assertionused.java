package otherProjectfile;

import org.testng.asserts.SoftAssert;

public class Assertionused {

public void HardAssert() {
	
		// static method  of Assert class is this is also know as Hard Assert
		
	//	Assert.assertEquals(false, null);
	//	Assert.assertNotEquals(null, null);
	//	Assert.assertSame(args, args);
	//	Assert.assertTrue(false);
//		Assert.assertFalse(false);
//		Assert.assertNotNull(args);
//		Assert.assertNull(args);

	}
	
	public void softAssert() {
		SoftAssert soft=new  SoftAssert();
		soft.assertAll(null);
		soft.assertEquals(false, false);
		soft.assertNotEquals(false, false);
		soft.assertNotNull(soft);
		soft.assertTrue(false);
		soft.assertFalse(false);
		
	}
	
}
