#language: en
@Login
Feature: Inicio de sesión

  Background:
    Given la página de inicio de sesión está abierta

  Scenario Outline: Inicio de sesión exitoso con credenciales válidas
    When el usuario ingresa "<usuario>" y "<contraseña>" y hace clic en el botón de login
    Then el usuario debería ver el mensaje de éxito "<mensaje_exito>"
    Examples:
      | usuario                    | contraseña   | mensaje_exito |
      | juuan214rebatta@gmail.com | Test.2024 | Logged in as  |

  Scenario Outline: Inicio de sesión fallido con credenciales inválidas
    When el usuario ingresa "<usuario>" y "<contraseña>" y hace clic en el botón de login
    Then el usuario debería ver el mensaje de error "<mensaje_error>"

    Examples:
      | usuario       | contraseña | mensaje_error                        |
      | test@test.com | Test.123   | Your email or password is incorrect! |
