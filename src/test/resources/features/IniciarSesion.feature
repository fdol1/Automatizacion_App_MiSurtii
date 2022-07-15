# Autor: lpinedau@choucairtesting.com
# language: en

Feature: Realizar el inicio de sesion en la app
  Como usuario de la app quiero realizar
  una autenticacion con mis credenciales

  @InicioDeSesion
  Scenario Outline: Intento de autenticacion, caso exitoso
    Given que Juan abre la app de Misurtii
    And Iniciar sesion con sus datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    Then Verifica el mensaje en el menu principal:Bienvenido
    Examples:
      | usuario    | clave     |
      | 1070966478 | Aleja3214 |