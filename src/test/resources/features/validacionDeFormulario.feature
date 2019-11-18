#Author: Wilmar SAnchez
#Creacion de formulario
@tag
Feature: Validacion formulario ColotLib
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Caso100_Validacion de formulario
    Given Ingreso a navegador
    And Iniciar sesion "<usuario>""<contrasena>"
    When Seleccionar formularios
    And Diligenciar Formulario uno con los siguiente datos "<row_index>"

    Examples: 
      | usuario | contrasena | row_index |
      | demo    | demo       |         1 |
      ##| "demo"  | "demo"     |         2 |
      ##| "demo"  | "demo"     |         3 |
      ##| "demo"  | "demo"     |         4 |
