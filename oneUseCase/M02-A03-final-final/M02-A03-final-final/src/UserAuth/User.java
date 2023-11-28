package UserAuth;

import Databases.Accessor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class User {

    private String username;
    private String password;
    private String name;
    public int id;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public int verifyUser() throws SQLException, ClassNotFoundException, IOException {
        Accessor a = new Accessor();
        ArrayList<String> res = a.accessLogins(username, password);

        if (res.get(1).equals("Driver")) { //input username and password, search users for where users = UN/pw, get role. If idfferent roles, return diff numbers
            this.id = parseInt(res.get(0));
            return 1;
        } else if (res.get(1).equals("DOTofficial")){
            this.id = parseInt(res.get(0));
            return 2;
        } else if (username.equals("LAWENFORCEMENT") && password.equals("police")){
            return 3;
        } else if (res.get(1).equals("Insurer")){
            this.id = parseInt(res.get(0));
            return 4;
        } else {
            return 0;
        }

    }

    public void setPassword(String password) throws SQLException, ClassNotFoundException {
        Accessor a = new Accessor();
        a.changePassword(password, this.id);
        this.password = password;
    } // need to change the password in the drivers.txt/database

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
