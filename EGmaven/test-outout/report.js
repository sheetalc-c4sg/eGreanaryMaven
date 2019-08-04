$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Sheetal/eGranary work/egranary java project/Egranary/EGmaven/src/main/java/com/eg/qa/features/EGranary.feature");
formatter.feature({
  "line": 1,
  "name": "Test EGranary applicaiton test",
  "description": "",
  "id": "test-egranary-applicaiton-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "EGHomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 38951536620,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "Test Login Feature",
  "description": "",
  "id": "test-egranary-applicaiton-test;test-login-feature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "User Proceed to Login",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "Validate Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_Proceed_to_Login()"
});
formatter.result({
  "duration": 17873639626,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.validate_Login_Page()"
});
formatter.result({
  "duration": 202847234,
  "status": "passed"
});
formatter.match({
  "location": "EGHomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 1112170288,
  "status": "passed"
});
});