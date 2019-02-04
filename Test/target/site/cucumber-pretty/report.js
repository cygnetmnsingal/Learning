$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_test1.feature");
formatter.feature({
  "line": 1,
  "name": "Maven Cucumber",
  "description": "",
  "id": "maven-cucumber",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "open page to test maven tutorial",
  "description": "",
  "id": "maven-cucumber;open-page-to-test-maven-tutorial",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Get the title",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCucumber.user_is_on_page()"
});
formatter.result({
  "duration": 13835099801,
  "status": "passed"
});
formatter.match({
  "location": "TestCucumber.get_the_title()"
});
formatter.result({
  "duration": 1135262738,
  "status": "passed"
});
});