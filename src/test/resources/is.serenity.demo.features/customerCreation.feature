# language: es

Característica: Creacion de un nuevo cliente

  Antecedentes: Inicio de sesion de usuario
    Dado Que voy a la pagina de inicio de sesion de startsharp
    Cuando Ingreso mi usuario
      | user  |
      | admin |
    E Ingreso mi clave
      | password |
      | serenity |
    Y Selecciono el boton de iniciar sesion
    Entonces Valido el inicio de sesion correcto

  @Case1
  Escenario: Creacion fallida de un nuevo cliente sin ingresar datos
    Cuando Despliego el modulo northwind
    Y Selecciono customers
    Y Selecciono newCustomer
    Y Selecciono save
    Entonces Valido alerta de error al crear un nuevo cliente

  @Case2
  Esquema del escenario: Creacion correcta de un nuevo cliente solo con campos obligatorios
    Cuando Despliego el modulo northwind
    Y Selecciono customers
    Y Selecciono newCustomer
    E Ingreso customer id
      | customerId   |
      | <customerId> |
    E Ingreso company name
      | companyName   |
      | <companyName> |
    Y Selecciono save
    Entonces Valido correcta creacion del cliente
      | customerId   |
      | <customerId> |

    Ejemplos:
      |customerId  |companyName|
    ##@externaldata@src/main/resources/data/DataDriven.xlsx@data@
   |12345   |Creators|











