import Pages.LoginPage;
import Pages.LogoutPage;
import org.openqa.selenium.devtools.v122.log.Log;
import org.testng.annotations.Test;

public class LogoutTest {


    LoginPage l=new LoginPage();
    LogoutPage l2=new LogoutPage();
    @Test(priority = 1)
    public void  LOGOUT(){
        l.Login("sarfarazali","docters400");
    l2.logout();
    }

}
