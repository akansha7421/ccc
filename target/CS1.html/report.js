$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:CaseStudy/CS1.feature");
formatter.feature({
  "name": "Registe Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User register to TestMeApp",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the Signup page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "CS1_c.the_Signup_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all the details",
  "keyword": "When "
});
formatter.match({
  "location": "CS1_c.user_enters_all_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Register button",
  "keyword": "Then "
});
formatter.match({
  "location": "CS1_c.user_clicks_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TestMeApp homepage opens",
  "keyword": "Then "
});
formatter.match({
  "location": "CS1_c.testmeapp_homepage_opens()"
});
formatter.result({
  "status": "passed"
});
});