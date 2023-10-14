package UserAuth;

import java.util.Scanner;

public class User {

    private String username;
    private String password;
    private String name;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public int verifyUser(){

        //this would call accessor to look at stored login/password combos to see if legit user
        //we are currently hardcoding

        Scanner mScan = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = mScan.nextLine();

        if (username.equals("DRIVER") && password.equals("vroom")) {
            return 1;
        } else if (username.equals("GOVERNMENT") && password.equals("dmv")){
            return 2;
        } else if (username.equals("LAWENFORCEMENT") && password.equals("police")){
            return 3;
        } else if (username.equals("INSURANCE") && password.equals("moneybags")){
            return 4;
        } else {
            return 0;
        }

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
