
  Feature: Login in the page saucedemo.com

    Background:
      Given that I find on the website saucedemo.com


    @Test
    #@Ignore
    #@Pending
    Scenario: Login to the saucedemo Successful site
      When  I login to the site with my credentials
      Then validates that title products are present



    @Test
    #@Ignore
    Scenario Outline:Section start with locked user
      When I login to the site with my secunds credentials
        | user     | <user>    |
        | password | <password>|
      Then check the message on the blocked user page

      Examples:
        | user            | password    |
        | locked_out_user | secret_sauce|








