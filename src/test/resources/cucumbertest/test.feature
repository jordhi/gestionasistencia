Feature:  Controlar assistencia

  Scenario:  Alumno logado
    Given  Profe logado en el sistema
    And  Alumno logado en el sistema
    When  Profe lista alumnos
    Then  Mostrar alumno presente
