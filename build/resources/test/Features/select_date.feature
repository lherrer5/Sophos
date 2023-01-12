Feature: interactuar  con la opcion Date Picker

  Scenario: Selecciono fecha en las opciones
    Given que el usuario sigue en la pagina de QA tool https://demoqa.com/
    When  entra a Date picker y Select Date y Date And Time
    Then  el usuario ve su fecha y tiempo escogido

