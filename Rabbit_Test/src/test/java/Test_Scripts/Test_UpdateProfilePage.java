package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Test_Base;
import Pages.UpdateProfilePage;

public class Test_UpdateProfilePage extends Test_Base {
	
	UpdateProfilePage updateProfilePage_OBJ;
	
public Test_UpdateProfilePage() {
		
		super();
	}


@BeforeClass
public void steup() {
	Initialization();
	updateProfilePage_OBJ = new UpdateProfilePage();
	
}
@Test(priority=1)
public void VerifyLogin() throws Exception {
	boolean T= updateProfilePage_OBJ.login();
		Assert.assertTrue(T);
}

@Test(priority=2)
public void VerifyNavigateMyDetailsPage() throws Exception {
	
	boolean T= updateProfilePage_OBJ.NavigateMyDetailsPage();
	Assert.assertTrue(T);
}

@Test(priority=3)
public void VerifyUpdateAddressAndSave() throws Exception {
	
	String  T= updateProfilePage_OBJ.UpdateAddressAndSave();
	Assert.assertEquals(T, "Details updated!");
}


@AfterClass
public void TearDown() {
	
	driver.quit();
}
}
