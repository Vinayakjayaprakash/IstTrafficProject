package GovernmentManagement;

import UserAuth.User;
import ViolationManagement.Violation;

import java.util.ArrayList;

public class Government {

    public User login;

    public Government(User u) {
        this.login = u;
    }

    public void addDriver() {
        //this would call to accessor
        //hardcoding here
        System.out.println("Driver added");
    }

    public void removeDriver(String driverId) {
        //this would call to accessor
        //hardcoding here
        System.out.println("Driver removed");
    }

    public void addVehicle() {
        //this would call to accessor
        //hardcoding here
        System.out.println("Vehicle added");
    }

    public void removeVehicle(String vehicleId) {
        //this would call to accessor
        //hardcoding here
        System.out.println("Vehicle removed");
    }

    public void removeViolation(String violationId) {
        //this would call to accessor
        //hardcoding here
        System.out.println("Violation removed");
    }

    public ArrayList<Violation> viewDriverViolations(String driverId) {
        //this would call to accessor
        //hardcoding here
        return new ArrayList<Violation>();
    }

    public ArrayList<Violation> viewAllViolations() {
        //this would call to accessor
        //hardcoding here
        return new ArrayList<Violation>();
    }

}
