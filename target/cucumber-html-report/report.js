$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Test.feature");
formatter.feature({
  "name": "Test web site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Test web site",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am sending email",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Web Page",
        "Text",
        "Title"
      ]
    },
    {
      "cells": [
        "https://en.wikipedia.org/wiki/Main_Page",
        "Welcome to",
        "Wikipedia"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test web site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am sending email",
  "keyword": "And "
});
formatter.match({
  "location": "lazarus.steps.web.wiki.Steps.iAmSendingEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});