Feature: Management medical service
  As a user, i want to register  a medical service inside in page

  @register
  Scenario: Registering medical appointment
    Given Alejandro needs to register with a new doctor
    When He does register process inside the Hospital page
      | firstname | lastname | telephone |
      | alejandro | aguirre  | 11111111  |
    Then Page shows him that Doctor is registered with the message Datos guardados correctamente.