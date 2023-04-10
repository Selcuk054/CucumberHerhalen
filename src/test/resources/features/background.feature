Feature: Gebruiker gebruikt background

  Background: ortak adim
    Given gebruiker gaat naar amazonwebsite
  @zoeken
    Scenario: TC04 Amazon zoekt verstelbare bureau
      And gebruiker zoekt een verstelbarebureau
      Then test de resultaten hebben verstelbare bureau
      And sluit de pagina

      Scenario: TC05 Amazon zoekt kaarsen
        And gebruiker zoekt kaarsen
        Then test de resultataen hebben kaarsen
        And sluit de pagina
