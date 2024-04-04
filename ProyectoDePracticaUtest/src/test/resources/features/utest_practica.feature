#language: es

Característica: Registrar usuario en uTest

  como usuario de Utest
  quiero ingresar a la pagina web
  para registrarme


  @Utest
  Escenario: Crear usario en uTest exitosamente
    Dado que Cristina ingresa a la pagina web de uTest
    Cuando diligencie el formulario de registro exitosamente
      | Nombre   | Apellido | Email           | Mes Nacimiento | Dia Nacimiento | Ano Nacimiento | Ciudad                                  | Codigo postal | Pais     | Computador | Version      | Lenguaje | Dispositivo | Modelo | Sistema operativo | Contrasena  | Confirmar Contrasena |
      | Cristina | Ruiz     | mcristinarzruiz@gmail.com | April          | 10             | 1989           | Medellín, Medellin, Antioquia, Colombia | 111           | Colombia | Ubuntu     | Ubuntu 23.10 | Spanish  | Nokia       | E65    | Symbian OS 6.     | Criss1989*. | Criss1989*.            |
    Entonces podra comenzar con uTest y ver el mensaje de bienvenida Welcome to the world's largest community of freelance software testers!

