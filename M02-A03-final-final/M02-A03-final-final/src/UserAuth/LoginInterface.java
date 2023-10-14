package UserAuth;

import java.util.Scanner;

public class LoginInterface {

    public LoginInterface(){

    }

    public User Login(){

        Scanner mScan = new Scanner(System.in);

        System.out.println("Enter Login:");
        String username = mScan.nextLine();

        System.out.println("Enter Password:");
        String password = mScan.nextLine();

        return new User(username, password);

    }

}
