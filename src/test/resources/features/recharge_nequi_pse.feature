Feature: Recharge Nequi PSE

  Background: I am in the nequi pse

  Scenario Outline: recarga
    Given I am in the payment gateway
    When I am on the recharge page, I fill in the data and confirm the process.
      | phoneNumber   | confirmentPhoneNumber   | amount   | typePerson   | bank   |
      | <phoneNumber> | <confirmentPhoneNumber> | <amount> | <typePerson> | <bank> |
    Then should direct me to the PSE page
      | email   |
      | <email> |
    And you must direct me to the bank's website and log me in with the access credentials.
      | username   | password   |questionSecurity||
      | <username> | <password> |<>
    Examples:
      | user  | pass     | nameMeeting | typeMeeting | numberMeeting | starDate            | endDate             | location | unit           | organizedBy  | reporter     | assistants   |
      | admin | serenity | auto2       | Customer    | 1234567       | 07/05/2026 09:26:00 | 07/05/2026 09:26:00 | HQ-02    | Administration | Aaron Taylor | Aaron Taylor | Aaron Taylor |