Feature: Management medical service with patient
  As a user, i want to register  a medical service inside in page

  @patient
  Scenario: Registering medical appointment
    Given Alejandro needs to register a patient
    When He does register patient inside the Hospital page
      | patient-firstname | patient-lastname | patient-telephone |
      | alejandro         | aguirre          | 08080808          |
    Then Page shows to him that  Patient was registered successfully with the message Datos guardados correctamente.