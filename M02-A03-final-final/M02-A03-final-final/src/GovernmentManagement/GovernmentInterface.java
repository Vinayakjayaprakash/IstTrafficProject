package GovernmentManagement;

import UserAuth.User;

import java.util.Scanner;

public class GovernmentInterface {

    public GovernmentInterface(User u) {
        System.out.println("Welcome to Government Interface, " + u.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Change Password");
        System.out.println("2. Add Driver");
        System.out.println("3. Remove Driver");
        System.out.println("4. Add Vehicle");
        System.out.println("5. Remove Vehicle");
        System.out.println("6. Remove Violation");
        System.out.println("7. View A Driver's Violations");
        System.out.println("8. View All Violations");
        System.out.println("9. Exit Interface");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();

        if (choice == 1) {
            System.out.println("Enter new password");
            String newPass = mScan.nextLine();
            u.setPassword(newPass);
        } else if (choice == 2) {
            Government g = new Government(u);
            g.addDriver();
        } else if (choice == 3) {
            Government g = new Government(u);
            System.out.println("Enter ID of driver to remove");
            String targetID = mScan.nextLine();
            g.removeDriver(targetID);
        } else if (choice == 4) {
            Government g = new Government(u);
            g.addVehicle();
        } else if (choice == 5) {
            Government g = new Government(u);
            System.out.println("Enter ID of vehicle to remove");
            String targetID = mScan.nextLine();
            g.removeVehicle(targetID);
        } else if (choice == 6) {
            Government g = new Government(u);
            System.out.println("Enter ID of violation to remove");
            String targetID = mScan.nextLine();
            g.removeViolation(targetID);
        } else if (choice == 7) {
            Government g = new Government(u);
            System.out.println("Enter ID of driver whose violation history to view");
            String targetID = mScan.nextLine();
            System.out.println(g.viewDriverViolations(targetID));
        } else if (choice == 8) {
            Government g = new Government(u);
            System.out.println(g.viewAllViolations());
        } else if (choice == 9) {
            return;
        }

    }

}
