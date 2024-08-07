Feature: Aperturar Cuentas de Ahorro
  Yo Como usuario nuevo
  Quiero aperturar una cuenta de ahorros
  Para hacer envio de dinero

  Background: Abrir la pagina del banco
    Given que Juan esta en la pagina del banco

    @Pending
  Scenario: Abrir cuenta de ahorros para usuarios no registrados con Builder
    And realiza el registro para un nuevo usuario
    When abre una cuenta de SAVINGS
    Then el deberia de ver su cuenta creada de manera exitosa