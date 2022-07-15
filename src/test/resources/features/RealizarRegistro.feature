# Autor: lufpined@choucairtesting.com
# language: en

Feature: Create users in the MiSurtii application

  Background: Se inicia sesion en la app
    Given que Juan abre la app de Misurtii

  @SuccessfulRegister
  Scenario Outline: Register in MiSurtii
    Given que juan ingresa sus credeciales personales
      | tipopersona   | numdocumento   |
      | <tipopersona> | <numdocumento> |
    When se ingresan los datos para el registro
      | numdocumento   | tipodocumento   | nombre   | apellido   | celular   | correo   | clave   | zona   | ciudad   | localidad   | ubicacion   | direccion   |
      | <numdocumento> | <tipodocumento> | <nombre> | <apellido> | <celular> | <correo> | <clave> | <zona> | <ciudad> | <localidad> | <ubicacion> | <direccion> |
    Then Valida el mensaje en pantalla:Puedes continuar con tu Registro.
    Examples:
      | tipopersona | numdocumento | tipodocumento        | nombre | apellido | celular    | correo            | clave        | zona  | ciudad   | localidad | ubicacion    | direccion    |
      | Natural     | 1067945333   | Cédula de ciudadanía | Sergio | Escobar  | 3015083227 | saer014@gmail.com | Choucair@22* | Antioquia | BELLO | piso 1 | Calle 64 #45 | Calle 64 #45 |

