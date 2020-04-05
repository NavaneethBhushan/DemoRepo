$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Navaneeth Bhushan/eclipse-workspace/Maven_Cucumber_1/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "CRM login feature",
  "description": "",
  "id": "crm-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8959871300,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "CRM login test scenario",
  "description": "",
  "id": "crm-login-feature;crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Page Title is CRM",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user to validate home page",
  "keyword": "Then "
});
formatter.match({
  "location": "login_stepdefinition.page_Title_is_CRM()"
});
formatter.result({
  "duration": 161959500,
  "status": "passed"
});
formatter.match({
  "location": "login_stepdefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 356040700,
  "status": "passed"
});
formatter.match({
  "location": "login_stepdefinition.user_to_validate_home_page()"
});
formatter.result({
  "duration": 5823800,
  "status": "passed"
});
formatter.after({
  "duration": 1685266300,
  "status": "passed"
});
});