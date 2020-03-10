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
  "name": "I am using the browser Chrome",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to the main \"\u003cWeb Page\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Web Page"
      ]
    },
    {
      "cells": [
        "https://en.wikipedia.org/wiki/Main_Page"
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
  "name": "I am using the browser Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "lazarus.steps.DriverCreation.i_am_using_the_browser_Chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the main \"https://en.wikipedia.org/wiki/Main_Page\"",
  "keyword": "And "
});
formatter.match({
  "location": "lazarus.steps.web.Steps.i_go_to_the_main(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Test2.feature");
formatter.feature({
  "name": "Test web site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Test web site",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am using the browser Chrome",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to the main \"\u003cWeb Page\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Web Page"
      ]
    },
    {
      "cells": [
        "https://en.wikipedia.org/wiki/Main_Page"
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
      "name": "@Test2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am using the browser Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "lazarus.steps.DriverCreation.i_am_using_the_browser_Chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the main \"https://en.wikipedia.org/wiki/Main_Page\"",
  "keyword": "And "
});
formatter.match({
  "location": "lazarus.steps.web.Steps.i_go_to_the_main(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});