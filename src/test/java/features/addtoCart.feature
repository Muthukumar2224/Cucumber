Feature: Cart Functionality

  Background: 
    Given User clicks on the login link

  @cleanUp
  Scenario Outline: Add a product to the cart
    And User should login as "<username>" and "<password>"
    And User search a "<book>"
    When User add the book to the cart
    Then the cart badge should be updated

    @Test
    Examples: 
      | username | password | book              |
      | ortoni   | pass1234 | Birthday Girl     |
      | ortonikc | pass1234 | Like a Love Story |

    @dev
    Examples: 
      | username | password | book       |
      | ortoni   | pass1234 | Fix Her Up |
