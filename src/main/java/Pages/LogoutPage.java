package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogoutPage extends BasePage{

    By logout =   By.partialLinkText("Logout");





    public void logout()  {
        String title =driver.getTitle();
        System.out.println("name is "+title);

        click(logout);
        // TearDown();
    }






}
