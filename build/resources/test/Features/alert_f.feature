Feature: interactuar  con la opcion Alerts,Frame & Windows

  Scenario: Interactuo con las alertas
    Given que el usuario continua en la pagina de QA tool https://demoqa.com/
    When  entra a opcion Alerts presiona click me y aceptar
    Then  el usuario sale de la ventana

