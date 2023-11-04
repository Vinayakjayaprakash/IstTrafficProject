package UserAuth;

import DriverManagement.DriverInterface;
import GovernmentManagement.GovernmentController;
import InsuranceManagement.InsuranceInterface;
import LawEnforcementManagement.LawEnforcementController;

// State interface
interface UserState {
    void handle(LoginController context);
}

// Concrete state classes
class DriverState implements UserState {
    @Override
    public void handle(LoginController context) {
        context.di = new DriverInterface(context.u);
        // Driver-specific logic...
    }
}

class GovernmentState implements UserState {
    @Override
    public void handle(LoginController context) {
        context.gc = new GovernmentController(context.u);
        // Government-specific logic...
    }
}

class LawEnforcementState implements UserState {
    @Override
    public void handle(LoginController context) {
        context.lec = new LawEnforcementController(context.u);
        // Law enforcement-specific logic...
    }
}

class InsuranceState implements UserState {
    @Override
    public void handle(LoginController context) {
        context.ii = new InsuranceInterface(context.u);
        // Insurance-specific logic...
    }
}

class LoggedOutState implements UserState {
    @Override
    public void handle(LoginController context) {
        // Handle the logged-out state
    }
}

public class LoginController {

    public LoginInterface li;
    public User u;

    public DriverInterface di;
    public GovernmentController gc;
    public LawEnforcementController lec;
    public InsuranceInterface ii;

    private UserState currentState;

    public LoginController() {
        this.li = new LoginInterface();
        u = li.Login();
        int userType = u.verifyUser();

        // Set the initial state based on the user type
        switch (userType) {
            case 1:
                setState(new DriverState());
                break;
            case 2:
                setState(new GovernmentState());
                break;
            case 3:
                setState(new LawEnforcementState());
                break;
            case 4:
                setState(new InsuranceState());
                break;
            default:
                setState(new LoggedOutState());
                break;
        }

        // Perform state-specific logic
        currentState.handle(this);
    }

    public void setState(UserState state) {
        this.currentState = state;
    }
}
