package DriverManagement;

import Databases.Accessor;
import UserAuth.User;
import ViolationManagement.Violation;

import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public class Driver {

    public User login;
    private int driverId;

    public ArrayList<String> violationIds;
    public ArrayList<String> vehicleIds;

    public Driver(User u) {
        this.login = u;
    }

    public Driver(User u, int driverId) {
        this.login = u;
        this.driverId = driverId;
    }

    public ArrayList<String> viewViolations() throws IOException, SQLException, ClassNotFoundException { //might change back to ArrayList<Violation>
        //this would call accessor
        Accessor a = new Accessor();
        ArrayList<String> violations = a.accessViolations(a.getId(this.driverId));
        return violations;
    }

    public int getDriverId() {
        return driverId;
    }

    public ArrayList<String> getViolationIds() {
        return violationIds;
    }

    public ArrayList<String> getVehiclePlates() {
        return vehicleIds;
    }

    @Override
    public String toString() {
        return "Driver ID: " + driverId + ", Name: " + login.getName()
                + "\nTotal Violations: " + violationIds.size()
                + "\nVehicles Registered: " + vehicleIds.size();
    }

}
