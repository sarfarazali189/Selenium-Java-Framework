import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  {
    LoginPage l=new LoginPage();

    @Test(priority = 1)
    public void  login_with_valid(){
l.Login("sarfarazali","docters400");

    }


    @Test(priority = 2)
    public void  login_with_invalid(){
        l.Login("sarfarazalishaikh","docters400");
    }


    @Test(priority = 3)
    public void  login_without_creds(){
        l.Login("","");
    }


    @Test(priority = 3)
    public void  login_logout(){
        l.Login_and_logout("sarfarazali","docters400");
    }
}
