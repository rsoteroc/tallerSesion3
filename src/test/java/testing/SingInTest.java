package testing;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pagesTodoist.MainPageTodoist;
import pagesTodoist.LoginTodoist;
import session.Session;

public class SingInTest {

    MainPageTodoist mainPageTodoist= new MainPageTodoist();
    LoginTodoist loginTodoist = new LoginTodoist();

    @Before
    public void setup(){
        // ir a la pagina todoist.com
        Session.getInstance().getDriver().get("https://todoist.com/");
    }

    @Test
    @DisplayName("Verify SignIn user")
    @Description("This test case is to verify that i can login")
    @Epic("Login")
    @Feature("Security Authetication")
    @Link("www.jira.com/SFSF3333")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("SFTT888")
    public void loginUserTodoist(){
        //  buenas practicas.
        //  Action **** Sobre que CONTROL **** Donde esta el Control
        //  Click on [Login] button in Login Page

        mainPageTodoist.singUpFreeLabel.click();

        loginTodoist.emailTxtBox.type("cadillobaltazar@gmail.com");
        loginTodoist.passwordTxtBox.type("12345678");
        loginTodoist.loginButton.click();
    }




    @After
    public void cleanUp(){
        Session.getInstance().closeSession();
    }


}
