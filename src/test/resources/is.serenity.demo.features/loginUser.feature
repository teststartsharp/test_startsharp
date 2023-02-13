# language: es

Característica: Inicio de sesion de usuario
  ##Como usuario quiero iniciar sesion en startsharp
@Case1
  Escenario: Iniciar sesion satisfactoriamente

    Dado Que voy a la pagina de inicio de sesion de startsharp
    Cuando Ingreso mi usuario
      | user  |
      | admin |
    Y Ingreso mi clave
      | password |
      | serenity |
    Y Selecciono el boton de iniciar sesion
    Entonces Valido el inicio de sesion correcto





