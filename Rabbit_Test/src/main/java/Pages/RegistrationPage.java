package Pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Test_Base;

public class RegistrationPage extends Test_Base{
	
	@FindBy(linkText="Register")
	WebElement Register;
	@FindBy(id="first-name")
	WebElement Firstname;
	@FindBy(id="last-name")
	WebElement Lastname;
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="phone")
	WebElement Phone;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(id="password-confirmation")
	WebElement PasswdConfirm;
	@FindBy(id="reg-submit-btn")
	WebElement Submit;
	
	
	@FindBy(xpath="//h1/strong[contains(text(),'Welcome')]")
	WebElement WelcomeReg;

public RegistrationPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	


 public String Registraion() {
	 
	 Register.click();
	 
	 Firstname.sendKeys(prop.getProperty("FirstName"));
	 
	 Lastname.sendKeys(prop.getProperty("LastName"));
	 
	 Random rndNum = new Random();   
	 System.out.println("RandomNum "+rndNum.nextInt(1000));
	 
	 Email.sendKeys(rndNum.nextInt(1000)+prop.getProperty("Emailid"));
	 
	 Phone.sendKeys(prop.getProperty("Phone"));
	 Password.sendKeys(prop.getProperty("Password"));
	 PasswdConfirm.sendKeys(prop.getProperty("PasswdConfirm"));
	 Submit.click();
	 
	 String Str= WelcomeReg.getText();
	 System.out.println(Str);
	 return Str;
 }
	
	
	
	
	
	
	
}
