package LawEnforcementManagement;

import UserAuth.User;

import java.util.Scanner;

public class LawEnforcementInterface {

    public LawEnforcementInterface(User u) {
        System.out.println("Welcome to Law Enforcement Interface, " + u.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Change Password");
        System.out.println("2. Add Violation");
        System.out.println("3. Remove Violation");
        System.out.println("4. View A Driver's Violations");
        System.out.println("5. View All Violations");
        System.out.println("6. Exit Interface");

        Scanner mScan = new Scanner(System.in);
        int choice = mScan.nextInt();
        if (choice == 1) {
            System.out.println("Enter new password");
            String newPass = mScan.nextLine();
            u.setPassword(newPass);
        } else if (choice == 2) {
            LawEnforcement le = new LawEnforcement(u);
            System.out.println("Enter ID of violation");
            String violationId = mScan.nextLine();
            System.out.println("Enter ID of driver");
            String driverId = mScan.nextLine();
            System.out.println("Enter ID of vehicle");
            String vehicleId = mScan.nextLine();
            System.out.println("Enter violation type");
            String violationType = mScan.nextLine();
            System.out.println("Enter timestamp");
            String timestamp = mScan.nextLine();
            le.addViolation(violationId, driverId, vehicleId, violationType, timestamp);
        } else if (choice == 3) {
            LawEnforcement le = new LawEnforcement(u);
            System.out.println("Enter ID of violation to remove");
            String targetID = mScan.nextLine();
            le.removeViolation(targetID);
        } else if (choice == 4) {
            LawEnforcement le = new LawEnforcement(u);
            System.out.println("Enter ID of driver whose violation history to view");
            String targetID = mScan.nextLine();
            le.viewDriverViolations(targetID);
        } else if (choice == 5) {
            LawEnforcement le = new LawEnforcement(u);
            System.out.println(le.viewAllViolations());
        } else if (choice == 6) {
            return;
        }

    }

}
