Feature: Registro de usuario en DemoQA

  Como usuario
  Quiero diligenciar el formulario
  Para validar que el registro es exitoso

  @form
  Scenario Outline: Registrar usuario con diferentes datos
    Given que el usuario abre el formulario de registro
    When diligencia el formulario con "<nombre>" "<apellido>" "<correo>" "<numero>" "<asignatura>" "<direccion>"
    Then debería ver el modal de confirmación con "<nombre>"

    Examples:
      | nombre | apellido | correo           | numero     | asignatura | direccion          |
      | Andres | QA       | andres@gmail.com | 3001234567 | Maths      | Calle 123 #45-67   |
      | Ana    | Tester   | ana@gmail.com    | 3158416082 | Chemistry  | Carrera 7 #78bis-9 |