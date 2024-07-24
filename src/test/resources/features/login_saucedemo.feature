Feature: Login en Sauncedemo
  yo como usuario de Saucedemo
  Quiero autenticarme
  para ver los productos de la pagina

  Background: Abrir Saucedemo
    Given que Juan se encuentra en la pagina

  Scenario: Autenticacion exitosa
    When el ingresa sus credenciales
    Then el usuario deberia ingresar a la pagina Products