package DriverManagement;

import UserAuth.User;

import java.util.Scanner;

public class DriverInterface {
    public DriverInterface(User u) {
        System.out.println("Welcome to Driver Interface, " + u.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Change Password");
        System.out.println("2. View Violations");
        System.out.println("3. Exit Interface");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter new password");
                String newPass = mScan.nextLine();
                u.setPassword(newPass);
                break;
            case 2:
                Driver d = new Driver(u);
                System.out.println(d.viewViolations());
                break;
            case 3:
                return;
            default:
                break;
        }

    }

}
