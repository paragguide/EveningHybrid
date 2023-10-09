Feature: Project Document file

  @amazon @uid
  Scenario: Amazon userid test
    Given i open "chrome" and enter url "https://www.amazon.in/"
    When I click signin
    And enter userid "paragguide@yahoo.co.in"
    And click continue button
    Then password txtbox must come
    But error message should not come
    
  @amazon @pwd 
  Scenario: Amazon password test
    Given userid is correct
    When i enter password "RMinfotech"
    And click submit button
    Then I should login
    But should not get error 
  
  
  @facebook
  Scenario Outline: Facebook Test
    Given i open "chrome" and open url "https://www.facebook.com/"
    When i enter userid <userid> and password <password>
    And  submit form
    Then check status 
    
   Examples:
   |userid | password |
   | aaa | aaa |
   | bbb | bbb |
   | ccc | ccc |
  