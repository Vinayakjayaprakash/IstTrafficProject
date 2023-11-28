package GovernmentManagement;

import UserAuth.User;

import java.sql.SQLException;

public class GovernmentController {

    public GovernmentInterface gi;

    public GovernmentController(User u) throws SQLException, ClassNotFoundException {
        this.gi = new GovernmentInterface(u);
    }

}
