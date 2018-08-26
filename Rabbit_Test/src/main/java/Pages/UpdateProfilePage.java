package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.Test_Base;

public class UpdateProfilePage extends Test_Base {

	//LoginPage Elements
	@FindBy(id="login-username")
	WebElement Username;
	@FindBy(id="login-password")
	WebElement Password;
	@FindBy(id="btn-login")
	WebElement Loginbtn;
	
	//LandingPage Elements
	@FindBy(xpath="//a[contains(text(),'rewards')]")
	WebElement RewardsLink;
	@FindBy(xpath="//li[@role='presentation' and @class='dropdown']")
	WebElement Myprofilelink;
	@FindBy(xpath="//a/img[@alt='my details']")
	WebElement Mydetaislink;
	
	//MyDetailspage elements
	@FindBy(linkText="Edit")
	WebElement Editbtn;
	@FindBy(linkText="Address")
	WebElement Addresslink;
	
	//Addresssection Elements
	@FindBy(id="home-address")
	WebElement Homeaddress;
	@FindBy(id="home-village-building")
	WebElement Village;
	@FindBy(id="home-soi")
	WebElement Soi;
	@FindBy(id="home-street")
	WebElement Street;
	@FindBy(id="home-province")
	WebElement Province;
	@FindBy(id="home-district")
	WebElement District;
	@FindBy(id="home-subdistrict")
	WebElement Subdistrict;
	
	//Save button
	@FindBy(xpath="//div[@id='address']//button[contains(text(),'Save')]")
	WebElement Savebttn;
	
	//updatedtext Confirmation
	@FindBy(xpath="//div[contains(text(),'Details updated')]")
	WebElement Updatetxt;
	
	
public UpdateProfilePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
public boolean login() throws Exception {
	
	
	Username.sendKeys(prop.getProperty("Username"));
	Password.sendKeys(prop.getProperty("Password"));
	
	Loginbtn.click();	
	
	Thread.sleep(3000);
return	RewardsLink.isDisplayed();
}


public boolean NavigateMyDetailsPage() throws Exception {
	
	RewardsLink.click();
	
	Actions action = new Actions(driver);

    action.moveToElement(Myprofilelink).build().perform();

    Mydetaislink.click();
    
    Thread.sleep(3000);
    return Editbtn.isDisplayed();
	
	
}

public String UpdateAddressAndSave() throws Exception {
	Editbtn.click();
	Addresslink.click();
	
	Thread.sleep(3000);
	Homeaddress.clear();
	Homeaddress.sendKeys(prop.getProperty("Homeaddress"));
	
	
	
	
	Village.clear();
	Village.sendKeys(prop.getProperty("Village"));
	
	Soi.clear();
	Soi.sendKeys(prop.getProperty("Soi"));
	
	Street.clear();
	Street.sendKeys(prop.getProperty("Street"));
	
	 Select objselect1= new Select(Province);
		objselect1.selectByVisibleText(prop.getProperty("ProvinceValue"));
		
		Select objselect2= new Select(District);
		objselect2.selectByVisibleText(prop.getProperty("DistrictValue"));
		
	       Select objselect3= new Select(Subdistrict);
			objselect3.selectByVisibleText(prop.getProperty("SubDistrictValue"));
	
	Savebttn.click();
	
	Thread.sleep(2000);
	return Updatetxt.getText();
	
}

















}
