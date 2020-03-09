@Test
Feature: Test web site

  Scenario Outline: Test web site
    Given I am using the browser Chrome
    And I go to the main "<Web Page>"
    And I close the browser Chrome

    Examples:
      | Web Page                                |
      | https://en.wikipedia.org/wiki/Main_Page |