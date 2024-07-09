Feature: login test

  Scenario Outline: testing the successful login
    Given the user is on the nequi page
    When attempts to login
     | phoneNumber   | pass   | dynamicKey   |
     | <phoneNumber> | <pass> | <dynamicKey> |
    Then validate the text on screen <message>
    Examples:
      | countryCode | phoneNumber | pass | dynamicKey | message     |
      | +57         | 3122974165  | 1022 | 120503     | TATIANA DURAN |