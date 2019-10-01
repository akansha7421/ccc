$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Cucumber1/demo.feature");
formatter.feature({
  "name": "login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enters Username and Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "TestMeAppLogin.the_login_page_is_opened()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d77.0.3865.90)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BDC6-DX-6FN7NK2\u0027, ip: \u002710.116.242.235\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\TRAINI~1.16\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:55939}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5a753d61080fb735014b145aef737874\n*** Element info: {Using\u003dlink text, value\u003dSignIn}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDef.TestMeAppLogin.the_login_page_is_opened(TestMeAppLogin.java:20)\r\n\tat ✽.the login page is opened(file:Cucumber1/demo.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters Lalitha as username",
  "keyword": "When "
});
formatter.match({
  "location": "TestMeAppLogin.user_enters_Lalitha_as_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters Password123 as password",
  "keyword": "And "
});
formatter.match({
  "location": "TestMeAppLogin.user_enters_Password_as_password(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user will find TestMeApp Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestMeAppLogin.user_will_find_TestMeApp_Homepage()"
});
formatter.result({
  "status": "skipped"
});
});