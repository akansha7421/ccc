$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Cucumber1/login_f.feature");
formatter.feature({
  "name": "Login action Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Credential with valid Credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The login page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_again.the_login_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"Lalitha\" as username and \"Password123\" as password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_again.the_user_enters_as_username_and_as_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "Login_again.the_user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user will find a TestMeApp Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_again.the_user_will_find_a_TestMeApp_Home_page()"
});
formatter.result({
  "status": "passed"
});
});