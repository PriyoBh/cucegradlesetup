Feature: Menu Management

  @SmokeTest
  Scenario: Add cucumber sandwich menu item

    Given I have a menu item with a name "Cucumber Sandwich" and price 20
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added

  @RegularTest
  Scenario: Add chicken sandwich menu item

    Given I have a menu item with a name "Chicken Sandwich" and price 30
    When I add that menu item
    Then Menu Item with name "Chicken Sandwich" should be added

    @NightTest
   Scenario: Add lamb sandwich menu item

     Given I have a menu item with a name "Lamb Sandwich" and price 30
     When I add that menu item
     Then Menu Item with name "Lamb Sandwich" should be added

  @NightTest @RegularTest
  Scenario: Add combo sandwich menu item

    Given I have a menu item with a name "Combo Sandwich" and price 30
    When I add that menu item
    Then Menu Item with name "Combo Sandwich" should be added