@Test
Feature: Test web seite

  Scenario Outline: Test web seite
    Given I am using the browser Chrome
    And I go to the main "<Web Page>"
    And I close the browser Chrome

    Examples:
      | Web Page                                |
      | https://en.wikipedia.org/wiki/Main_Page |