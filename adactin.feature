Feature: Hotel Booking In Adactin Application

Scenario:  Login Module
   
    Given verify that user can able launch the url
    When verify that user can able enter the user name in text box
    And verify that given user can able to enter the password in text files
    Then verify that given user can able to click login button to navigate search hotel page

Scenario: search hotel
   
    When verify thet the user can able to select location dropdown
    And verify thet the user can able to select hotel dropdown
    And verify thet the user can able to select Room_type dropdown
    And verify thet the user can able to select No_rooms dropdown
    And verify thet the user can able to enter check in date
    And verify thet the user can able to enter check out date
    And verify thet the user can able to select adults in room
    And verify thet the user can able to select children in room
    Then verify user can able to click search button

Scenario: select Hotel
    When verify user can able to click select option
    Then verify user can able to click continue button and navigate to next page
    
Scenario: Book a Hotel
    When verify that the user can able to enter first name
    And verify that the user can able to enter last name
    And verify that the user can able to enter address
    And verify that the user can able to enter credit card number
    And verify that the user can able to select credit card type
    And verify that the user can able to select expiry month
    And verify that the user can able to select expiry year
    And verify that the user can able to enter cvv number
    Then verify that user can able to click booknow button  

 Scenario: Booking confirmation
     Then verify that the user can able to click logout button to cancel the booking