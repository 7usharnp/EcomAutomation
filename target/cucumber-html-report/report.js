$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality scenarios",
  "description": "",
  "id": "registration-functionality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8880865500,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Verify whether the user is restricted from creating a duplicate account",
  "description": "",
  "id": "registration-functionality-scenarios;verify-whether-the-user-is-restricted-from-creating-a-duplicate-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@Two"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "I navigate to Account Registration page",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I provide all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Tushar"
      ],
      "line": 43
    },
    {
      "cells": [
        "LastName",
        "Nangare-Patil"
      ],
      "line": 44
    },
    {
      "cells": [
        "Email",
        "tusharnangre5446@gmail.com"
      ],
      "line": 45
    },
    {
      "cells": [
        "Telephone",
        "8380802646"
      ],
      "line": 46
    },
    {
      "cells": [
        "Password",
        "tushar1234"
      ],
      "line": 47
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I select the Privacy Policy",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I should see user is restricted from creating duplicate account",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 5632054700,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_navigate_to_Account_Registration_page()"
});
formatter.result({
  "duration": 1277372800,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_provide_all_the_below_valid_details(DataTable)"
});
formatter.result({
  "duration": 1126314100,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_select_the_Privacy_Policy()"
});
formatter.result({
  "duration": 173215300,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_click_on_Continue_button()"
});
formatter.result({
  "duration": 1628568300,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_should_see_user_is_restricted_from_creating_duplicate_account()"
});
formatter.result({
  "duration": 110298100,
  "status": "passed"
});
formatter.after({
  "duration": 810223600,
  "status": "passed"
});
});