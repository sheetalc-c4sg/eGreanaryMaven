Feature: Test EGranary applicaiton test

Background: 
Given user opens browser

Scenario: Validate homepage test

Then user is on homepage
Then close the browser

@FTS
Scenario: Validate full text search

Then user validate full text search
Then enter search term and click on find button
Then Validate the search term
Then Validate Advance link
Then Validate Search Help link
Then close the browser

@CS @RegressionTest
Scenario: Validate Catalog Search
Then user validate catalog  search
Then user enters catalog search term and click on find button
Then Validate the catalog search term
Then Validate catalog Advance link
Then Validate catalog Search History link
Then Validate catalog Search Help link
Then close the browser

@BBC @RegressionTest
Scenario: Validate Browse by category search
Then Validate Browse by category
Then user clicks on link under BBC
Then Click and Validate Categorized link
Then close the browser


#Easy Find Buttons
@EFB @RegressionTest
Scenario: Test and Validate Easy Find Button
Then Validate Easy Find Button
Then Click And Validate Audio link
Then Click and Validate Video link
Then close the browser

@BL
Scenario: Test and Validate Broken links and Responses
Then Validate any broken links
Then close the browser

# Add to Favorite
@ATF
Scenario: Test Add to Favorite feature
Then Validate Easy Find Button
Then Click And Validate Audio link
Then Click on Add to favorite by logging in
Then close the browser

@Login @RegressionTest
Scenario: Test Login Feature
Then User Proceed to Login
Then Validate Login Page
Then close the browser
 
#Featured Resource
@FR 
Scenario: Test Featured Resource
Then User Validate Featured Resource
Then close the browser



@CIP @RegressionTest
Scenario: Test Customer Information Portal
Then User clicks on link CIP
Then CIP user proceed to login
Then CIP editor displays after successful login
Then close the browser
