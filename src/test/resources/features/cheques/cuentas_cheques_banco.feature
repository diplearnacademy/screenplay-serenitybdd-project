Feature: Aperturar Cuentas de Cheques
  Yo Como usuario nuevo
  Quiero aperturar una cuenta de ahorros
  Para hacer envio de dinero

  Background: Abrir la pagina del banco
    Given que Juan esta en la pagina del banco

  Scenario: Abrir cuenta de Cheques para usuarios no registrados con Builder
    And realiza el registro para un nuevo usuario
    When abre una cuenta de CHECKING
    Then el deberia de ver su cuenta creada de manera exitosa