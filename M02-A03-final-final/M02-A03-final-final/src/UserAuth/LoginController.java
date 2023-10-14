package UserAuth;

import DriverManagement.DriverInterface;
import GovernmentManagement.GovernmentController;
import InsuranceManagement.InsuranceInterface;
import LawEnforcementManagement.LawEnforcementController;

public class LoginController {

    public LoginInterface li;
    public User u;

    public DriverInterface di;
    public GovernmentController gc;
    public LawEnforcementController lec;
    public InsuranceInterface ii;

    public LoginController() {

        this.li = new LoginInterface();
        u = li.Login();
        int user = u.verifyUser();

        switch (user) {
            case 1:
                this.di = new DriverInterface(this.u);
                break;
            case 2:
                this.gc = new GovernmentController(this.u);
                break;
            case 3:
                this.lec = new LawEnforcementController(this.u);
                break;
            case 4:
                this.ii = new InsuranceInterface(this.u);
                break;
            default:
                break;
        }

    }

}
