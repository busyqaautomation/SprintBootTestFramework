package Pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Main_Page {

	@Autowired
	private Login_Page lg;
	
	@Autowired

	private Home_Page page;
	
	@Value("${app.url}")
	private String appURL;
	
	@Autowired
	private WebDriver webDriver;
	
	  //      public Main_Page(Login_Page lg, Home_Page page) {
	 //      	this.lg= lg;
		//       this.page= page;
	    //           }
	
	public  void performLogin() {
	
		webDriver.navigate().to(appURL);
		System.out.println("Login:" +appURL);
		
		page.ClickLogin();
	
	lg.Login( "admin", "adminpassword");
	
	
	lg.ClickLogin();
	}
		
	}
	
	

