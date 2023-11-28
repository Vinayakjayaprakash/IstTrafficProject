package LawEnforcementManagement;

import UserAuth.User;
import ViolationManagement.Violation;

import java.util.ArrayList;

public class LawEnforcement {

    public User login;

    public LawEnforcement(User u) {
        this.login = u;
    }

    public void addViolation(String violationId, String driverId, String vehicleId, String violationType, String timestamp) {
        //this would call to accessor
        //hardcoding here
        System.out.println("Violation added");
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
