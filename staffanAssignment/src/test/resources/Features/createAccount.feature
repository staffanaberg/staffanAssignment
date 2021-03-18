Feature: Create Account
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
  
		Given I have logged in at Mailchimp  
    And I have entered <email>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | email  | value | status  |
      | "staffan.aaberg@gmail.com" |     5 | success |

