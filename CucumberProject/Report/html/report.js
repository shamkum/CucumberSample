$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User login to facebook application",
  "description": "",
  "id": "login-feature;user-login-to-facebook-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": ": user is on facebook application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": user enters username\u003cemail\u003e and password\u003cpass\u003e",
  "rows": [
    {
      "cells": [
        "sham",
        "sham1234"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": ": user click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Logic.user_is_on_facebook_application()"
});
formatter.result({
  "duration": 3606460800,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_enters_username_email_and_password_pass(DataTable)"
});
formatter.result({
  "duration": 384892000,
  "status": "passed"
});
formatter.match({
  "location": "Logic.user_click_on_login_button()"
});
formatter.result({
  "duration": 159402400,
  "status": "passed"
});
});