package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;
 @Component
public class Home_Page {
@FindBy(how= How.LINK_TEXT, using= "Login")
public WebElement lnkLogin;

@FindBy(how = How.LINK_TEXT, using ="Employee List")
public WebElement lnkEmployeeList;

public Login_Page ClickLogin() {
//	lnkLogin.click();
	System.out.println("Click the home page login");
return new Login_Page();
}
public void ClickEmployeeList() {
	lnkEmployeeList.click();
}
}
