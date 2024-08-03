package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Given("la página de inicio de sesión está abierta")
    public void laPáginaDeInicioDeSesiónEstáAbierta() {
        loginPage.laPáginaDeInicioDeSesiónEstáAbierta();
    }

    @When("el usuario ingresa {string} y {string} y hace clic en el botón de login")
    public void elUsuarioIngresaYYHaceClicEnElBotónDeLogin(String usuario, String contraseña) throws InterruptedException {
        loginPage.elUsuarioIngresaYYHaceClicEnElBotónDeLogin(usuario,contraseña);
    }

    @Then("el usuario debería ver el mensaje de éxito {string}")
    public void elUsuarioDeberíaVerElMensajeDeÉxito(String mensaje_exito) throws InterruptedException {
        loginPage.elUsuarioDeberíaVerElMensajeDeÉxito(mensaje_exito);
    }

    @Then("el usuario debería ver el mensaje de error {string}")
    public void elUsuarioDeberíaVerElMensajeDeError(String mensaje_error) throws InterruptedException {
        loginPage.elUsuarioDeberíaVerElMensajeDeError(mensaje_error);
    }




}
