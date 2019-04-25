Feature: This feature file is designed for login functionality

Scenario Outline:create an account
Given launch the "chrome" browser and having url "http://automationpractice.com/index.php" and click on sign-in link
When the page is displayed, verify module header is "Create an account" and enter the valid Email address "<valid email id>" and click on the Sign-in button
Then enter the your personal information "<firstname>","<lastname>","<password>","<date>","<month>","<year>"
Then enter the address of the yousers "<company>","<address>","<city>","<state>","<zipcode>","<mobilenumber>"
Then click on register button which is navigating to my account page and click on sin-out button 
When the page is displayed, verify module header is "Already registered?" and Enter valid username  and password "<password>"
And click on the signin button
And verify user is navigated to the next page sucessfully "My account - My Store"
And quit the browser
Examples:
|valid email id|firstname|lastname|password|date|month|year|company|address|city|state|zipcode|mobilenumber|
|ab_Ab@gmail.com|hari|vanama|kiran123456|20|5|2001|mindq|hyd,balanagar,mainroad|Algona|47|98001|8889855124|






