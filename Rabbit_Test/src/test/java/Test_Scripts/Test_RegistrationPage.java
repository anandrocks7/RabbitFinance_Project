package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Test_Base;
import Pages.RegistrationPage;

public class Test_RegistrationPage extends Test_Base {

	RegistrationPage RegisPage_OBJ;
	
public Test_RegistrationPage() {
		
		super();
	}
	
@BeforeClass
public void steup() {
	Initialization();
	RegisPage_OBJ = new RegistrationPage();
	
}
@Test(priority=1)
public void VerifRegistration() {
	String Text= RegisPage_OBJ.Registraion();
	
	Assert.assertEquals(Text, "Welcome TESTFIRST!");
		
}


@AfterClass
public void TearDown() {
	
	driver.quit();
}

}
