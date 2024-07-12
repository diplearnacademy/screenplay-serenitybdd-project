Feature: Aperturar Cuentas de Ahorro
  Yo Como usuario nuevo
  Quiero aperturar una cuenta de ahorros
  Para hacer envio de dinero

  Background: Abrir la pagina del banco
    Given que Juan esta en la pagina del banco

  Scenario: Abrir cuenta de ahorros para usuarios no registrados
    And realiza el registro como nuevo usuario
      | nombre | apellido  | nick |
      | Juan   | Fernandez | jkl  |
    When abre una cuenta de SAVINGS
    Then el deberia de ver su cuenta creada de manera exitosa


#  Scenario: Abrir cuenta de cheques para usuarios no registrados
#    And realiza el registro como nuevo usuario
#    When abre una cuenta de CHECKING
#    Then el deberia de ver su cuenta creada de manera exitosa
