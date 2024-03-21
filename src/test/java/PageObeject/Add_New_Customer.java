package PageObeject;

import java.util.List;

import org.bouncycastle.asn1.ASN1Set;
import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class Add_New_Customer {
public WebDriver ldriver;

public Add_New_Customer(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
WebElement customer;
@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")
WebElement customers;
@FindBy(className="btn")
WebElement addbutton;
@FindBy(name="Email")
WebElement email;
@FindBy(id="Password")
WebElement password;
@FindBy(id="FirstName")
WebElement firstname;
@FindBy(id="LastName")
WebElement lastName;
@FindBy(id="Gender_Female")
WebElement gender;
@FindBy(css="span[aria-label='select']")
WebElement dateOfBirthButton;
@FindBy(id="Company")
WebElement company;
@FindBy(xpath="(//input[@id='IsTaxExempt'])[1]")
WebElement tax;
@FindBy(xpath="//div[@role='listbox'][1]")
WebElement newsletter;
@FindBy(name="VendorId")
WebElement vendor;
@FindBy(xpath="/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card/div/div[2]/div[8]/div[2]/input")
WebElement active;
@FindBy(id="AdminComment")
WebElement admin;
@FindBy(name="save")
WebElement savebutton;
@FindBy(id="SearchEmail")
WebElement searchemail;
@FindBy(id="search-customers")
WebElement searchbutton;
@FindBy(xpath ="//table[@id='customers-grid']")
WebElement searchresult;
@FindBy(xpath="//table[@id='customers-grid']//tbody/tr")
List<WebElement> tablerowsElement;
@FindBy(xpath="//table[@id='customers-grid']//tbody/td")
List<WebElement> tablecolumnsElement;
@FindBy(xpath="//table[@id='customers-grid']//tbody/tr/td[2]")
List<WebElement> emaiList;
public void clickCustomerMenu() {
	customer.click();
}
public void clickCustomers() {
	customers.click();
}
public void clickAdd() {
	addbutton.click();
}
public void enterEmail(String emai) {
	email.sendKeys(emai);
}
public void enterPassword(String pwd) {
	password.sendKeys(pwd);
}
public void enterFirst(String firstn) {
	firstname.sendKeys(firstn);
}
	public void enterLast(String last) {
		lastName.sendKeys(last);
	
	}
	public void clickGender() {
		gender.click();
	}
	public void dateOfBirth() {
		dateOfBirthButton.click();
	}
	public void enterCompany(String com) {
		company.sendKeys(com);
	}
	public void clickTax() {
		tax.click();
	}
	public void clickNewsletter() {
		newsletter.click();
	}
	public void enterVendor(String ven) {
		vendor.sendKeys(ven);
		
	}
	public void clickActive() {
		active.click();
	}
	public void enterAdmin(String adm) {
		admin.sendKeys(adm);
	}
	public void clickSaveButton() {
		savebutton.click();
	}
	public void enterSearchEmail(String searchem) {
		searchemail.sendKeys(searchem);
	}
	public void clickSearchButton() {
		searchbutton.click();
	}
	public boolean searchByEmail(String expectedEmailString) {
		boolean found=false;
		for(WebElement em: emaiList) {
			String value=em.getText();
			if(value.contains(expectedEmailString)) {
				found=true;
				break;
			}
			else {
				found=false;
			}
		
		}
		
		
		
		
	
		return found;
		
	

	}
}

