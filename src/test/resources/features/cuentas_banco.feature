Feature: Aperturar Cuentas de Ahorro
  Yo Como usuario nuevo
  Quiero aperturar una cuenta de ahorros
  Para hacer envio de dinero


  Scenario Outline: Abrir cuenta de ahorros para usuarios no registrados
    Given que Juan esta en la pagina del banco
    And realiza el registro como nuevo usuario
    When abre una cuenta de <tipoCuenta>
    Then el deberia de ver su cuenta creada de manera exitosa
    Examples:
      | tipoCuenta |
      #| CHECKING   |
      | SAVINGS    |