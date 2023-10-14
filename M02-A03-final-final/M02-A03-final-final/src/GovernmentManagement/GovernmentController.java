package GovernmentManagement;

import UserAuth.User;

public class GovernmentController {

    public GovernmentInterface gi;

    public GovernmentController(User u) {
        this.gi = new GovernmentInterface(u);
    }

}
