Feature: Consultar Pokemon

  Scenario: Obtener un Pokemon por nombre y metodo
    Given servicio pokemon disponible
    When obtener pokemon "ditto" y metodo "abilities"
    Then deberia recibir un codigo de estado 200
    And respuesta contiene "101"