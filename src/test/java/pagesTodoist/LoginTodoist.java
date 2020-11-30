package pagesTodoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginTodoist {


    public TextBox emailTxtBox= new TextBox(By.id("email"),"[Email] TextBox in Sign In Page");
    public TextBox passwordTxtBox= new TextBox(By.id("password"),"[Password] TextBox in Sign In Page");
    public Button loginButton= new Button(By.xpath("//button[@class='submit_btn ist_button ist_button_red sel_login']"),"[Sign In] Button in Sign In Page");


    public LoginTodoist(){}
}
