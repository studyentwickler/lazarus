@WikipediaHomePage
Feature: Testing wordings and title on the home page

  Scenario Outline: Test web site
    Given I am using the browser Chrome
    And I go to the main web page "<Web Page>"
    Then I start to check that in right top corner I have text "<Text>" and link title "<Title>"

    Examples:
      | Web Page                                | Text       | Title     |
      | https://en.wikipedia.org/wiki/Main_Page | Welcome to | Wikipedia |