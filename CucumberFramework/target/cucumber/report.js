$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/CucumberFramework/FeatureFiles/login.feature");
formatter.feature({
  "name": "Login into account",
  "description": "\tExisting globalpoem user should not be able to login into account using incorrect credentials",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login into account with correct details",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to globalpoem websites",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigates_to_stackoverflow_websites()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Content Management button on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_clicks_on_the_login_button_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters an invalid username",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enters_an_invalid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters an invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enters_an_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be taken to the unsuccessful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_should_be_taken_to_the_unsuccessful_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});