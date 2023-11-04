Onboarding User Design Pattern
Changes Made:

Added an onboardNewUser method to the LoginInterface class to guide new users through the system setup process after they log in.
Introduced a isNewUser method in the User class to check if the user is logging in for the first time.
The Login method in LoginInterface now checks if the user is new and, if so, initiates the onboarding process.
Purpose:

To provide a welcoming and informative first-time experience for new users.
To ensure new users are familiar with system features and setup requirements.


State Object-Oriented Pattern
Changes Made:

Created a UserState interface and several concrete state classes (DriverState, GovernmentState, LawEnforcementState, InsuranceState, LoggedOutState) to represent different user session states.
Modified the LoginController class to hold a UserState instance that dictates the current state of the user session.
The LoginController constructor now sets the initial state based on the user type and delegates state-specific behavior to the corresponding state class.
Purpose:

To encapsulate state-specific behaviors within state classes, making the LoginController class's behavior dynamic and easier to manage.
To allow the LoginController to change its behavior when its internal state changes, without requiring a complex series of conditionals.