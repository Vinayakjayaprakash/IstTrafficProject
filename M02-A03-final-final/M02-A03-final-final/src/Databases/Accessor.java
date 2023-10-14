package Databases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Accessor {

    public Accessor() {

    }

    public HashMap<String, String> accessLogins() throws IOException {

        HashMap<String, String> pairs = new HashMap<>();

        String fileName = "logins.txt";
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String next;
        while( (next = br.readLine()) != null) {
            String[] splits = next.split("=");
            pairs.put(splits[0], splits[1]);
        }

        br.close();
        fr.close();

        return pairs;

    }

//    public String[] accessDrivers() {
//
//        return;
//
//    }

//    public String[] accessVehicles() {
//
//        return;
//
//    }

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

//    public String[] accessViolations() {
//
//        return;
//
//    }

}
