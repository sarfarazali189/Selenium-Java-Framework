package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.PasswordAuthentication;

public class LoginPage extends BasePage {
By username=   By.id("username");
By password=   By.id("password");
By login =   By.id("login");
    By logout =   By.partialLinkText("Logout");


public void Login(String Username, String Password)  {
   Intialize();
    driver.get("https://adactinhotelapp.com/");

     writeText(username,Username);
//    driver.findElement(By.id("username")).sendKeys("sarfarazali");

      writeText(password, Password);
  //  driver.findElement(By.id("password")).sendKeys("docters400");

      click(login);
 //   driver.findElement(By.id("login")).click();
  //  Thread.sleep(3000);
    //String name;
    //name=driver.findElement(By.id("username_show")).getText();
    String title =driver.getTitle();
System.out.println("name is "+title);

    Assert.assertEquals(title,"Adactin.com - Search Hotel" );
   // TearDown();
//click(logout);
}




    public void Login_and_logout(String Username, String Password)  {
        Intialize();
        driver.get("https://adactinhotelapp.com/");

        writeText(username,Username);
//    driver.findElement(By.id("username")).sendKeys("sarfarazali");

        writeText(password, Password);
        //  driver.findElement(By.id("password")).sendKeys("docters400");

        click(login);
        //   driver.findElement(By.id("login")).click();
        //  Thread.sleep(3000);
        //String name;
        //name=driver.findElement(By.id("username_show")).getText();
        String title =driver.getTitle();
        System.out.println("name is "+title);

        Assert.assertEquals(title,"Adactin.com - Search Hotel" );

click(logout);
        // TearDown();
    }
















}
