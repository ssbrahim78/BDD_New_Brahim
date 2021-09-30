@regression @smoke @Amazon
Feature: Amazon search box
  @sanity
  Scenario Outline: : testing search box in amazon home page
    Given the user lands to the Amazon home page
    When user enter "<Input>"
    Then  user should see a corespending "<Result>"
    Examples:
      |Input|Result|
      |  galaxy7   |  galaxy7  |
      |  iphone 11   |  galaxy7 |
      |  battery   |  galaxy7  |