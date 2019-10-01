$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Cucumber1/parameter_login.feature");
formatter.feature({
  "name": "Login action Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful Credential with valid Credential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open the application",
  "keyword": "Given "
});
formatter.step({
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "Password123"
      ]
    },
    {
      "cells": [
        "admin",
        "pass123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful Credential with valid Credential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "para_Login.open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "para_Login.user_click_SignIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"Lalitha\" and \"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "para_Login.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "para_Login.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful Credential with valid Credential",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "para_Login.open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "para_Login.user_click_SignIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"admin\" and \"pass123\"",
  "keyword": "And "
});
formatter.match({
  "location": "para_Login.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "para_Login.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "passed"
});
});