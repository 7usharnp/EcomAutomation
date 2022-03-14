$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality feature",
  "description": "",
  "id": "search-functionality-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4127453500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify whether user is informed when product being searched is not available",
  "description": "",
  "id": "search-functionality-feature;verify-whether-user-is-informed-when-product-being-searched-is-not-available",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Two"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search for a product \"Apple iphone\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should see \"There is no product that matches the search criteria.\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 3408841800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple iphone",
      "offset": 24
    }
  ],
  "location": "Search.i_search_for_a_product(String)"
});
formatter.result({
  "duration": 902750600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "There is no product that matches the search criteria.",
      "offset": 14
    }
  ],
  "location": "Search.i_should_see_message(String)"
});
formatter.result({
  "duration": 116634500,
  "status": "passed"
});
formatter.after({
  "duration": 744117400,
  "status": "passed"
});
});