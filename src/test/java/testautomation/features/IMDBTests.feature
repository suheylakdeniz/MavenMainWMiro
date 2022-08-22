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







