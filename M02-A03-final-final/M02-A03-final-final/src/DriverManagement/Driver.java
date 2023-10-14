package DriverManagement;

import UserAuth.User;
import ViolationManagement.Violation;

import java.util.ArrayList;

public class Driver {

    public User login;
    private String driverId;

    public ArrayList<String> violationIds;
    public ArrayList<String> vehicleIds;

    public Driver(User u) {
        this.login = u;
    }

    public Driver(User u, String driverId) {
        this.login = u;
        this.driverId = driverId;
    }

    public ArrayList<Violation> viewViolations() {
        //this would call accessor
        //hardcoding here
        return new ArrayList<Violation>();
    }

    public String getDriverId() {
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
