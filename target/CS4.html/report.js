$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:CaseStudy/CS4.feature");
formatter.feature({
  "name": "Add to cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User moves to cart without adding any item in it",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "ALex has opened TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "CS4_c.alex_has_opened_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Alex search for particular project",
  "keyword": "When "
});
formatter.match({
  "location": "CS4_c.alex_search_for_particular_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "try to proceed to payment without adding any item in the cart",
  "keyword": "And "
});
formatter.match({
  "location": "CS4_c.try_to_proceed_to_payment_without_adding_any_item_in_the_cart()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@href\u003d\u0027displayCart.htm\u0027]\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BDC6-DX-6FN7NK2\u0027, ip: \u002710.116.242.235\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\TRAINI~1.16\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:55943}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: fef471f547e5b6ae402d0d26c63ee773\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027displayCart.htm\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat CaseStudy_p.CS4_c.try_to_proceed_to_payment_without_adding_any_item_in_the_cart(CS4_c.java:50)\r\n\tat ✽.try to proceed to payment without adding any item in the cart(file:CaseStudy/CS4.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Testme doesnt display the cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "CS4_c.testme_doesnt_display_the_cart_icon()"
});
formatter.result({
  "status": "skipped"
});
});