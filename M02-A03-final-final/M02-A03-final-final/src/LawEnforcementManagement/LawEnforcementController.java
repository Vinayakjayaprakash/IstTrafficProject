package LawEnforcementManagement;

import UserAuth.User;

public class LawEnforcementController {

    public LawEnforcementInterface lei;

    public LawEnforcementController(User u) {
        this.lei = new LawEnforcementInterface(u);
    }

}
