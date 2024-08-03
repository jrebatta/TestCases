package pages;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import paths.LoginPath;

public class LoginPage extends Base {

    private LoginPath loginPath = new LoginPath();

    public LoginPage(WebDriver driver) {super();}

    public LoginPage() {
        super();
    }

    public void laPáginaDeInicioDeSesiónEstáAbierta(){
        new LoginPage(driver);
        chromeDriverConnection();
        visit(LoginPath.url);
        maximize();

    }

    public void elUsuarioIngresaYYHaceClicEnElBotónDeLogin(String usuario, String contraseña) throws InterruptedException {
        implicitWait(2000);
        type(usuario, loginPath.inputEmail);
        type(contraseña, loginPath.inputPassword);
        click(loginPath.btnLogin);
    }

    public void elUsuarioDeberíaVerElMensajeDeÉxito(String mensaje_exito) throws InterruptedException {
        implicitWait(2000);
        String msj = getText(loginPath.loggedInAsElement).trim();
        Assert.assertTrue("El mensaje no contiene el texto esperado", msj.contains(mensaje_exito));
    }

    public void elUsuarioDeberíaVerElMensajeDeError(String mensaje_error) throws InterruptedException {
        implicitWait(2000);
        String msj = getText(loginPath.errorMessage);
        Assert.assertEquals(msj.trim(), mensaje_error);


    }


}
