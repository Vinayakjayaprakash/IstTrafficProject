package InsuranceManagement;

import UserAuth.User;

import java.sql.SQLException;
import java.util.Scanner;

public class InsuranceInterface {
    public InsuranceInterface(User u) throws SQLException, ClassNotFoundException {
        System.out.println("Welcome to Insurance Interface, " + u.getName());
        System.out.println("Select Functionality:");
        System.out.println("1. Change Password");
        System.out.println("2. Request Driver Violation History by ID");
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
                Insurance i = new Insurance(u);
                System.out.println("Enter ID of driver whose violation history to view");
                String targetID = mScan.nextLine();
                System.out.println(i.requestDriverViolationHistory(targetID));
                break;
            case 3:
                return;
            default:
                break;
        }

    }

}
