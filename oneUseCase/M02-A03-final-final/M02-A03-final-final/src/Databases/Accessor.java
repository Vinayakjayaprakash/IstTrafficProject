package Databases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Accessor {

    Connection conn;

    public Accessor() throws ClassNotFoundException, SQLException { //return role and ID
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         this.conn= DriverManager.getConnection("jdbc:ucanaccess://C:/Users/robbi/Downloads/group3.accdb");
    }

    public ArrayList<String> accessLogins(String un, String pw) throws IOException, SQLException {
        ArrayList<String> pairs = new ArrayList<>();
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT ID, Role from user WHERE LoginID = '" + un + "' and Password = '" + pw + "'");

        while(rs.next()) {
            pairs.add(rs.getString(1));
            pairs.add(rs.getString(2));
        }
        conn.commit();
        conn.close();

        return pairs;
    }

    public int getId(int userID) throws SQLException {
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT ID from driver WHERE UserID = '" + userID + "'");

        int id;
        while(rs.next()) {
            id = parseInt(rs.getString(1));
            return id;
        }
        return -1;
    }

    public String[] accessDrivers() throws IOException{
        List<String> drivers = new ArrayList<>();

        String filename = "drivers.txt";
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String next;
        while ( (next = br.readLine()) != null) {
            drivers.add(next);
        }

        String[] d = new String[drivers.size()];
        for (int i = 0; i < drivers.size(); i++) {
            d[i] = drivers.get(i);
            i++;
        }
        return d;
    }

    public String[] accessVehicles() throws IOException{
        ArrayList<String> vehicles = new ArrayList<>();

        String filename = "vehicles.txt";
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String next;
        while ( (next = br.readLine()) != null) {
            vehicles.add(next);
        }

        String[] v = new String[vehicles.size()];
        for (int i = 0; i < vehicles.size(); i++) {
            v[i] = vehicles.get(i);
            i++;
        }

        return v;

    }

    public ArrayList<String> accessViolationTypes() throws IOException {

        ArrayList<String> types = new ArrayList<>();

        String fileName = "logins.txt";
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String next;
        while( (next = br.readLine()) != null) {
            types.add(next);
        }

        br.close();
        fr.close();

        return types;

    }

    public ArrayList<String> accessViolations(int id) throws IOException, SQLException {
        ArrayList<String> violations = new ArrayList<>();

        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from DriverViolation WHERE driverID = '" + id + "'");


        while(rs.next()) {
            violations.add("Violation ID: " + rs.getString(3) + "\nViolation Date: " + rs.getString(4) + "\nViolation Status: " + rs.getString(5) + "\nFine: " + rs.getString(6));
        }

        return violations;

    }

    public boolean changePassword(String password, int id) {
        try {
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery("UPDATE user SET Password = '" + password + "' WHERE ID = '" + id + "'");

            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
