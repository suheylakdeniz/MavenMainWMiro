@web
  @wip


  Feature: Miro Search Cases

    Scenario: Miro with Genres
      Given navigate to the IMDB homepage
      And click menu for movies list
      When click top 250 movies
      Then I should see "IMDb Top 250 Movies" page is loaded successfully


