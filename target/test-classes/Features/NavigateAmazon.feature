Feature: Login to Amazon homepage and select the product

Scenario: Navigating to Amazon homepage

Given User has opened the browser
When browser is open
Then Enter url Amazon and go
Then Hover over the Account Tab 
Then click on SignIn 
Then enter username and password and login
Then Hover on Shop by department tab
Then Move curser to headphones under Electronics,computer & office
Then click on headphones link
Then type philips on search tab on Headphones and Earphones page
Then click on philips lighweight in-ear SHE
Then System should navigate to this product page