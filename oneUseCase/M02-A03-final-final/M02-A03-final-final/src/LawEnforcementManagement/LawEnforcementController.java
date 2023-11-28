package LawEnforcementManagement;

import UserAuth.User;

import java.sql.SQLException;

public class LawEnforcementController {

    public LawEnforcementInterface lei;

    public LawEnforcementController(User u) throws SQLException, ClassNotFoundException {
        this.lei = new LawEnforcementInterface(u);
    }

}
