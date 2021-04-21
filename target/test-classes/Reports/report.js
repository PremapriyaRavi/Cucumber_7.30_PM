$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/PREMA/eclipse-workspace/Cucumber_7.30PM/src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login functionality of CrazySales Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the registration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "The user fill the \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" and \"\u003cconfirmpw\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on create new button",
  "keyword": "And "
});
formatter.step({
  "name": "The user  was registered sucessfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "confirmpw"
      ]
    },
    {
      "cells": [
        "Shobi",
        "123456",
        "123456"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user has to be in the CrazySales login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_be_in_the_CrazySales_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the registration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "The user fill the \"Shobi\" and \"123456\" and \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_fill_the_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on create new button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_create_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user  was registered sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.theUserWasRegisteredSucessfully()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.LoginSteps.theUserWasRegisteredSucessfully(LoginSteps.java:62)\r\n\tat ✽.The user  was registered sucessfully(C:/Users/PREMA/eclipse-workspace/Cucumber_7.30PM/src/test/resources/Features/login.feature:20)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});