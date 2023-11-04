package UserAuth;

import java.util.Scanner;

public class LoginInterface {

    public LoginInterface(){

    }

    public User Login(){
        Scanner mScan = new Scanner(System.in);

        System.out.println("Welcome to the IST Traffic System!");
        System.out.println("Please enter your login details.");

        System.out.println("Enter Login:");
        String username = mScan.nextLine();

        System.out.println("Enter Password:");
        String password = mScan.nextLine();

        User user = new User(username, password);
        int userType = user.verifyUser();

        if (userType == 0) {
            System.out.println("Login failed. Please check your credentials.");
        } else {

            if (user.isNewUser()) {
                onboardNewUser(mScan, user);
            } else {
                System.out.println("Welcome back, " + user.getName() + "!");
            }
        }

        mScan.close();
        return user;
    }

    private void onboardNewUser(Scanner scanner, User user) {
        System.out.println("It looks like you're new here. Let's get you set up.");

        System.out.println("Enter your full name:");
        String name = scanner.nextLine();
        user.setName(name);

        // Additional onboarding steps can be added here
        System.out.println("Here are some features you can use:");
        // List features...

        System.out.println("Your account is now set up. We're excited to have you on board!");
    }
}
