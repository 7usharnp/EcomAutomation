$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality Feature",
  "description": "",
  "id": "login-functionality-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6101234100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether the user is able to login with valid credentials",
  "description": "",
  "id": "login-functionality-feature;verify-whether-the-user-is-able-to-login-with-valid-credentials",
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
  "name": "I navigate to login page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I Login to application using username \"tusharnangre5446@gmail.com\" and password \"tushar1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see that user is able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 3479167000,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_navigate_to_login_page()"
});
formatter.result({
  "duration": 1052063700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tusharnangre5446@gmail.com",
      "offset": 39
    },
    {
      "val": "tushar1234",
      "offset": 81
    }
  ],
  "location": "Login.i_login_to_application_using_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 2686027300,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_should_see_that_user_is_able_to_login_successfully()"
});
formatter.result({
  "duration": 82429800,
  "status": "passed"
});
formatter.after({
  "duration": 781870700,
  "status": "passed"
});
formatter.before({
  "duration": 4635859900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify whether user is able to login with invalid credentials",
  "description": "",
  "id": "login-functionality-feature;verify-whether-user-is-able-to-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I navigate to login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Login to application using username \"tusharnangre5446@gmail.com\" and password \"tushartest\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see validation message for incorrect credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 3846757900,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_navigate_to_login_page()"
});
formatter.result({
  "duration": 946895600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tusharnangre5446@gmail.com",
      "offset": 39
    },
    {
      "val": "tushartest",
      "offset": 81
    }
  ],
  "location": "Login.i_login_to_application_using_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 666814900,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_should_see_validation_message_for_incorrect_credentials()"
});
formatter.result({
  "duration": 53153600,
  "status": "passed"
});
formatter.after({
  "duration": 723364700,
  "status": "passed"
});
formatter.before({
  "duration": 2315636800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify whether user is able to login without providing credentials",
  "description": "",
  "id": "login-functionality-feature;verify-whether-user-is-able-to-login-without-providing-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I navigate to login page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Login to application using username \"\" and password \"\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should see validation message for incorrect credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 3770111800,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_navigate_to_login_page()"
});
formatter.result({
  "duration": 1328154200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 39
    },
    {
      "val": "",
      "offset": 55
    }
  ],
  "location": "Login.i_login_to_application_using_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 865172100,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_should_see_validation_message_for_incorrect_credentials()"
});
formatter.result({
  "duration": 76047600,
  "status": "passed"
});
formatter.after({
  "duration": 843253700,
  "status": "passed"
});
formatter.before({
  "duration": 2208739600,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify whether user is able to reset the forgotten password",
  "description": "",
  "id": "login-functionality-feature;verify-whether-user-is-able-to-reset-the-forgotten-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I navigate to login page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I reset the forgotten password for email \"tusharnangre5446@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should see a message informing the user that information related to resetting password have been sent to email address",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 3406357600,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_navigate_to_login_page()"
});
formatter.result({
  "duration": 1203125800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tusharnangre5446@gmail.com",
      "offset": 42
    }
  ],
  "location": "Login.i_reset_the_forgotten_password_for_email(String)"
});
formatter.result({
  "duration": 2289038400,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_should_see_a_message_informing_the_user_that_information_related_to_resetting_password_have_been_sent_to_email_address()"
});
formatter.result({
  "duration": 60720800,
  "status": "passed"
});
formatter.after({
  "duration": 733314200,
  "status": "passed"
});
});