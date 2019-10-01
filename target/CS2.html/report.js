$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:CaseStudy/CS2.feature");
formatter.feature({
  "name": "Login with multiple username",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Enter Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The application page is open",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks SignIn link",
  "keyword": "When "
});
formatter.step({
  "name": "The user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Message displays Login Successful",
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
        "Anki12345",
        "qwerty"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Enter Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The application page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CS2_c.the_application_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "CS2_c.user_clicks_SignIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"Lalitha\" and \"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "CS2_c.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displays Login Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "CS2_c.message_displays_Login_Successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Enter Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The application page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CS2_c.the_application_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks SignIn link",
  "keyword": "When "
});
formatter.match({
  "location": "CS2_c.user_clicks_SignIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"Anki12345\" and \"qwerty\"",
  "keyword": "And "
});
formatter.match({
  "location": "CS2_c.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displays Login Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "CS2_c.message_displays_Login_Successful()"
});
formatter.result({
  "status": "passed"
});
});