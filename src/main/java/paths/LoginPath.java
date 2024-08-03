package paths;

import org.openqa.selenium.By;

public class LoginPath {

    public static final String url = "https://www.automationexercise.com/login";
    public By inputEmail = By.xpath("//input[@data-qa='login-email']");
    public By inputPassword = By.xpath("//input[@data-qa='login-password']");
    public By btnLogin = By.xpath("//button[@data-qa='login-button']");
    public By loggedInAsElement = By.xpath("//ul[@class='nav navbar-nav']/li[last()]");
    public By errorMessage = By.cssSelector("p[style='color: red;']");

}
