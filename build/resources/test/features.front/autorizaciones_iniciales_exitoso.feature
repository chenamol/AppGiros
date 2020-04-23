

@autorizacionesiniciales
Feature: Autorizaciones Iniciales
  Yo como ciudadano Colombiano quiero Aceptar las condiciones establecidas
  para  Cumplir uno de los requisitos de la apertura de cuenta digital


  @autorizacionesinicialesexitoso
  Scenario: Confirmar Autorizaciones Iniciales Exitoso
    Given El ciudadano se encuentra en la pagina inicial de la App
    When El ciudadano indica que desea crear su cuenta de ahorro digital
    And El ciudadano acepta las autorizaciones iniciales
      |cedula |
      | 334886|
    Then El puede continuar y visualizar el mensaje Momento de las fotos