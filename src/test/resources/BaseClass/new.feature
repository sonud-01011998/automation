
Feature: example

@smoke
 Scenario Outline: Enter a data
 Given User launch with a Browser
 Then launch site with a url
 Then Enter a '<username>'
 Then Enter an '<email>'
 Then Enter in '<phoneno>'
 Then Enter  '<Address>'
 When User  to select Gender
 Then  User need to select  Days
 Then User need to select Country
 
 
 
 Examples:
   | username | email                | phoneno    |Address|
   | nitu     | sonul5@gmail.com | 9834582 |atpost |
    
 