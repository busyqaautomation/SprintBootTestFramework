package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;
@Component

public class Login_Page {

	
	@FindBy (how =How.NAME, using ="UserName")
public WebElement txtUserName;
	@FindBy(how = How.NAME, using="Password")
	public WebElement txtPassword;
	@FindBy (how = How.CSS, using =".btn-default")
    public RemoteWebElement btnLogin;
	
	public void Login(String username, String password) {
	//	txtUserName.sendKeys("username");
	 //   txtPassword.sendKeys("password");
	System.out.println("UserName and password:" + username +"  " +password);
	}
public Home_Page ClickLogin() {
	System.out.println("Click login from login page");
return new Home_Page();
}



}
