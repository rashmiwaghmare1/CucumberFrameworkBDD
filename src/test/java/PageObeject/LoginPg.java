package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPg {
	
WebDriver ldriver;
public LoginPg(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	
}
@FindBy(id="Email")
WebElement emailaddress;

@FindBy(id="Password")
WebElement password;

@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
WebElement login;
@FindBy(linkText="Logout")
WebElement logout;

public void enterEmail(String email) {
	emailaddress.clear();
	emailaddress.sendKeys(email);
}
public void enterPassword(String pwd) {
	password.clear();
    password.sendKeys(pwd);

}
public void loginButton() {
	login.click();
}
public void logoutButton() {
	logout.click();
}
}
