@web
@wip


Feature: IMDB Circus Cases

  Scenario: Searching with Circus
    Given navigate to the IMDB homepage
    And click menu for movies list
    And click Award & Events --> Oscars
    And select "1929" as Event History
    And select "The Circus" as Honorary Award
    Then I should see and keep director, writer and stars information
    And I click imdb button to back to the homepage
    And write "The Circus" into search text
    When the page open I should see director, writer and stars informations should be the same
    Then I click see all photos button






