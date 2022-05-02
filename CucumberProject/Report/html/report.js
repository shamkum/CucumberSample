$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User login to facebook application",
  "description": "",
  "id": "login-feature;user-login-to-facebook-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": ": user is on facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": ": user enters username \u003cemail\u003e and password \u003cpass\u003e",
  "rows": [
    {
      "cells": [
        "sham",
        "sham1234"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": ": user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": user closes the application",
  "keyword": "But "
});
formatter.match({
  "location": "Logic.user_is_on_facebook_application()"
});
formatter.result({
  "duration": 24229518200,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_enters_username_email_and_password_pass(DataTable)"
});
formatter.result({
  "duration": 245897900,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_click_on_login_button()"
});
formatter.result({
  "duration": 132482200,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_closes_the_application()"
});
