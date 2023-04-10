@toplam
Feature: Amazon Search
@Nutella
  Scenario: TC01 gebruiker zoekt een woord bij Amazon

    Given gebruiker gaat naar amazonwebsite
    Then gebruiker zoekt monitor
    And test de resultaten heeft Monitor
    And sluit de pagina
@Java
  Scenario: TC02 gebruiker zoekt curved monitor bij Amazon
    Given gebruiker gaat naar amazonwebsite
    Then gebruiker zoekt curved monitor
    And test de resultataen hebben Curved Monitor
    And sluit de pagina
@Macbook
  Scenario: TC003 gebruiker zoekt telefoon hoesjes bij Amazon
    Given gebruiker gaat naar amazonwebsite
    Then gebruiker zoekt telefoon hoesjes
    And test de resultaten hebben telefoon hoesjes
    And sluit de pagina

