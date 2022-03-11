$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality scenarios",
  "description": "",
  "id": "registration-functionality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 29053020700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether the user is able to register into the application by providing all the fields",
  "description": "",
  "id": "registration-functionality-scenarios;verify-whether-the-user-is-able-to-register-into-the-application-by-providing-all-the-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Account Registration page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I provide all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Tushar"
      ],
      "line": 7
    },
    {
      "cells": [
        "LastName",
        "Nangare-Patil"
      ],
      "line": 8
    },
    {
      "cells": [
        "Email",
        "tusharnangre5446@gmail.com"
      ],
      "line": 9
    },
    {
      "cells": [
        "Telephone",
        "8380802646"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "tushar1234"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I select the Privacy Policy",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see that the User Account has successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 3445899500,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_navigate_to_Account_Registration_page()"
});
formatter.result({
  "duration": 26900,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_provide_all_the_below_valid_details(DataTable)"
});
formatter.result({
  "duration": 3030000,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_select_the_Privacy_Policy()"
});
formatter.result({
  "duration": 27500,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_click_on_Continue_button()"
});
formatter.result({
  "duration": 34100,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_should_see_that_the_User_Account_has_successfully_created()"
});
formatter.result({
  "duration": 38600,
  "status": "passed"
});
formatter.after({
  "duration": 807297800,
  "status": "passed"
});
});