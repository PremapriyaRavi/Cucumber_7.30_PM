@E2E
Feature: To validate the search functionality of the Crazysales application

Background: 
 Given the user has to be in crazysales page
 
@Regression
Scenario: To validate the search functionality_2
 When the user select the category as musical instruments from all catergories
 And from instrument search  the prouduct name as "piano keyboard"
 And click the first product of piano keyboard
 Then naviagate piano keyboard add to cart page
 
 @Sanity @smoke
Scenario: To validate the search functionality_3
 When the user select the category as sports from all catergories
 And  from sports search the prouduct name as "gloves"
 And click the second product of gloves
 Then naviagate gloves add to cart page
 
 @Regression
Scenario: To validate the search functionality_1
 When the user select the category as home appliants from all catergories
 And from home appliants search the prouduct name as "mop cleaner"
 And click the third product of mop
 Then naviagate mop add to cart page
 
 