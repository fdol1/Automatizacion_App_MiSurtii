# Author: lpinedau@choucairtesting.com

Feature: Realizar un pedido de productos ofertados en la app
  Como usuario quiere realizar un pedido para una
  Fecha terminada desde la app

  Background: Se inicia sesion en la app
    Given que Juan abre la app de Misurtii
#    When Iniciar sesion con sus datos
#      | usuario    | clave     |
#      | 1070966478 | Aleja3214 |

  @RealizarPedido
  Scenario Outline: Intento de realizacion de pedido
    Given que juan quiere realizar un pedido
    When selecciona los productos deseados
      | nombreProducto   | cantidad   | diaEntrega   |
      | <nombreProducto> | <cantidad> | <diaEntrega> |
    Then podra verificar el mensaje:Pedido Agregado con Exito
    Examples:
      | nombreProducto                        | cantidad | diaEntrega        |
      | Aceite vegetal La Sevillana x 1000 ml | 3        | Lunes 18 De Julio |