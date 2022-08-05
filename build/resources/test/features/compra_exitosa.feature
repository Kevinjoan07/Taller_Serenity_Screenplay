
  Feature:buy an item in saucedemo.com

    Scenario: purchase an item in the website of saucedemo successfully
      Given that I find on the website saucedemo.com
      And I login to the site with my credentials
      When I buy a product
      Then I check the order confirmed message

