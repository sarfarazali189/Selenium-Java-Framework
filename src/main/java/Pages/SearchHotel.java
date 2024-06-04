package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchHotel extends BasePage{

    By username=   By.id("username");
    By password=   By.id("password");
    By login =   By.id("login");

  By Location =  By.id("location");
  By rooms= By.id("room_nos");
  By checkin=  By.id("datepick_in");
   By checkout=  By.id("datepick_out");
   By adult= By.id("adult_room");
   By search = By.id("Submit");

    public void search_hotel(String Username, String Password)  {
        Intialize();
        driver.get("https://adactinhotelapp.com/");

        writeText(username,Username);

        writeText(password, Password);

        click(login);
        Select l = new Select(driver.findElement(Location));
        l.selectByVisibleText("Paris");

        Select r = new Select(driver.findElement(rooms));
        r.selectByValue("1");

        driver.findElement(checkin).sendKeys("04/06/2024");

        driver.findElement(checkout).sendKeys("05/06/2024");

        Select a = new Select(driver.findElement(adult));
        a.selectByValue("1");


   click(search);
        TearDown();

    }

    public void Search()  {
        driver.get("https://adactinhotelapp.com/");






        }







}
