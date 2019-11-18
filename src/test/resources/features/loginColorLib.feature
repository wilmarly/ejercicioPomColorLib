#Author: Wilmar Sanchez
#Keywords Summary :
#Feature: Inicio de sesion para aplicaciòn ColorLib
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Inicio sesion ColorLob
  I want to use this template for my feature file

  @tag1
  Scenario: Inicio sesion ColorLob
    Given Ingreso a navegador
    When Ingresar usuario "demo"
    And Ingresar Contraseña "demo"
    And Click en boton ingresar
    Then se valida ongreso correcto
    And check more outcomes
