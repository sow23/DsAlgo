Feature: SignIn page and sign out
  Scenario Outline: SignIn page and redirect to home page
    Given user navigates to SignIn page
    Then User should see login username and password fields
    When User enters "<username>" and "<password>"
    Then User clicks on Login
    Then Login failure message is displayed

    Examples:
      | username       | password   |
      | goaldiggers@23 | dsalgogoal |
