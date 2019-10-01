$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:CaseStudy/CS3.feature");
formatter.feature({
  "name": "Search Engine",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for head phones",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The TestMeApp is open",
  "keyword": "Given "
});
formatter.match({
  "location": "CS3_c.the_TestMeApp_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters Lalitha as username and Password123 as password",
  "keyword": "When "
});
formatter.match({
  "location": "CS3_c.the_user_enters_Lalitha_as_username_and_Password_as_password(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user logins",
  "keyword": "Then "
});
formatter.match({
  "location": "CS3_c.the_user_logins()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user searches headphones as search item",
  "keyword": "Then "
});
formatter.match({
  "location": "CS3_c.the_user_searches_headphones_as_search_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Find Details",
  "keyword": "Then "
});
formatter.match({
  "location": "CS3_c.the_user_clicks_on_Find_Details()"
});
formatter.result({
  "status": "passed"
});
});