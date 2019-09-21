Feature:Registration functionality
  @test1
  Scenario: verify user Registeration on automationpractice demo site
    Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User fills registration details
    Then Verify registered user on homepage