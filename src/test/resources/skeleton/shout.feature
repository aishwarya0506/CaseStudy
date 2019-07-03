Feature: Shout

  Scenario: Listener hears a message
    Given Lucy is 10 meters away from Sean 
    When  Sean shouts "Free Puppies"
    Then  Lucy hears Sean's message

