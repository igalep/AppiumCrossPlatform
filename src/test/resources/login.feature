Business Need: test login flow

  Scenario Outline: As a user I want to login to the system
    Given I logged in with "<username>" and "<password>"
    Then the landing page is "<displayed>"

    Examples:
      |username|password|displayed|
      |validUserName|validPassword|true|
      |wrongUserName|wrongPassword|false|