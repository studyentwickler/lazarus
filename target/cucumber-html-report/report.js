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
  "name": "I go to the main web page \"\u003cWeb Page\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I start to check that in right top corner I have text \"\u003cText\u003e\" and link title \"\u003cTitle\u003e\"",
  "keyword": "Then "
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
  "name": "I am using the browser Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "lazarus.steps.DriverCreation.i_am_using_the_browser_Chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I go to the main web page \"https://en.wikipedia.org/wiki/Main_Page\"",
  "keyword": "And "
});
formatter.match({
  "location": "lazarus.steps.web.wiki.Steps.i_go_to_the_main_web_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I start to check that in right top corner I have text \"Welcome to\" and link title \"Wikipedia\"",
  "keyword": "Then "
});
formatter.match({
  "location": "lazarus.steps.web.wiki.Steps.iStartToCheckThatInRightTopCornerIHaveTextAndLinkTitle(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cWikipedia[w]\u003e but was:\u003cWikipedia[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat lazarus.steps.web.wiki.Steps.iStartToCheckThatInRightTopCornerIHaveTextAndLinkTitle(Steps.java:28)\n\tat ✽.I start to check that in right top corner I have text \"Welcome to\" and link title \"Wikipedia\"(file:///Users/wahl/Desktop/testing/lazarus/src/test/resources/features/Test.feature:7)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.afterstep({
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
formatter.embedding("image/png", "embedded3.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I go to the main \"https://en.wikipedia.org/wiki/Main_Page\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.afterstep({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});