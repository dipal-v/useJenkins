
  Feature: ESB microservice to get the correct terminal owner for given IMSI
    Scenario: User should be able to get Terminal Owner
      When User gets response for terminal id '901112118097036'
      Then He should get response code '200'