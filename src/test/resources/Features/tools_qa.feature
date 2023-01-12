Feature: interactuar  con los elementos de la pagina QaTool


  Scenario: Agregar registro a la tabla
    Given que el usuario esta en la pagina de QA tool https://demoqa.com/
    When  agrega un registro en el elemento webTable
    Then  el usuario puede ver el registro creado en la tabla


  #Scenario: Eliminar registro a la tabla
   # Given que el usuario sigue en la pagina de QA tool https://demoqa.com/
    #When  elimina un registro en el elemento webTable
   # Then  el usuario puede ver el registro eliminado en la tabla

