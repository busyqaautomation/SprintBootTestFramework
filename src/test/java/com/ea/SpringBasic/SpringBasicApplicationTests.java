package com.ea.SpringBasic;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import Libraries.WebDriverLibrary;
import Pages.Home_Page;
import Pages.Login_Page;
//import Pages.Home_Page;
//import Pages.Login_Page;
import Pages.Main_Page;

@SpringBootTest(classes= {Main_Page.class,Login_Page.class,Home_Page.class,WebDriverLibrary.class})
@Profile("qa")

class SpringBasicApplicationTests {
  @ Autowired 
  private Main_Page mainpage;
  
  @Value("${app.url}")
  private String appURL;
  
  @Value("chrome,firefox,edge")
  private List<String>browsers;
	@Test
	void performLoginTest() {
		
		

	 
	mainpage.performLogin();
	}

}
