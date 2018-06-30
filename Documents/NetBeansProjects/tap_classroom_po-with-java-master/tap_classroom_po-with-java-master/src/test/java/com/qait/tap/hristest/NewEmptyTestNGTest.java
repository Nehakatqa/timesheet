package com.qait.tap.hristest;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewEmptyTestNGTest {
    
    WebDriver driver;
    
    LoginForm loginForm;
    
    
   @Test
    public void attempt_Login_With_Incorrect_Password_Should_Render_Error_Message(){
        Assert.assertTrue(loginForm
                .loginWithIncorrectCredentials("INVALID_USERN", "INVALUD_PASSWORD").contains("Invalid Login"));
    }
    
   @Test
    public void attempt_Login_With_No_Password_Should_Annotate_Black_Password_Field(){
        loginForm.login("nehakathuria"," ");
        // red border in password entry
        Assert.assertTrue(loginForm.isPasswordEntryAnnotated());  
    }
    @Test
    public void login_with_correct_credentials() throws InterruptedException
    {
    	System.out.println(driver.getCurrentUrl());
    	loginForm.loginWithCorrectCredentials("raman", "qainfotech");
    	String expected_url="https://s-hris.qainfotech.com:8086/employee";
    	
    }
  
    
    @BeforeClass
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.get("https://s-hris.qainfotech.com");
        loginForm = new LoginForm(driver);
    }
    
    @AfterClass
    public void closeBrowser(){
       // driver.quit();
    }
    
}
