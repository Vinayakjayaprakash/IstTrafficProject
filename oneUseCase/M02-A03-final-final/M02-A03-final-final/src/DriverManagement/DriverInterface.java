package DriverManagement;

import UserAuth.User;

import java.io.IOException;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class DriverInterface {
    public DriverInterface(User u) throws SQLException, ClassNotFoundException {
        System.out.println("\n\n\n\n\n\n___________________________________________");
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
                Scanner scnr1 = new Scanner(System.in);
                String newPass = scnr1.nextLine();
                u.setPassword(newPass);
                DriverInterface di1 = new DriverInterface(u);
            case 2:
                try {
                    Driver d = new Driver(u, u.id);
                    ArrayList<String> res = d.viewViolations();
                    for (String s : res) {
                        System.out.println(s + "\n");
                    }

                    System.out.println("Enter OK when done.");
                    Scanner scnr2 = new Scanner(System.in);

                    if (scnr2.next().toUpperCase().equals("OK")) {
                        DriverInterface di2 = new DriverInterface(u);
                    }
                    break;
                } catch (IOException e){
                    e.printStackTrace();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            case 3:
                exit(0);
            default:
                break;
        }

    }

}
