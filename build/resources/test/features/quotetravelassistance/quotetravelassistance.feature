Feature: Traveler assistance - Home
  As a user
  I want to quote travel insurance
  To travel more calmly to my destination

  @tag1
  Scenario Outline: Quote travel assistance
    Given I want to quote my travel insurance
    When Enter my destiny information <name> and <email> and <mobile> and <new_destiny> and <discount_code>
    Then I can quote insurance for my trip
    Examples:
      | name        |email                      |mobile    |new_destiny|discount_code|
      |Diego Alvarez|diego.alvarez@castor.com.co|3012458709|Argentina  |21XJENN      |