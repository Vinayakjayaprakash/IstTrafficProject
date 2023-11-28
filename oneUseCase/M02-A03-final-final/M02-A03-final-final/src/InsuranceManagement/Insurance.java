package InsuranceManagement;

import UserAuth.User;
import ViolationManagement.Violation;

import java.util.ArrayList;

public class Insurance {

    public User login;

    public Insurance(User u) {
        this.login = u;
    }

    public ArrayList<Violation> requestDriverViolationHistory(String driverId) {
        //this would call to accessor
        //hardcoding here
        return new ArrayList<Violation>();
    }

}
