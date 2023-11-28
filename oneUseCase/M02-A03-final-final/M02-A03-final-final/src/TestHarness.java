import UserAuth.LoginController;

import java.io.IOException;
import java.sql.*;

//import java.util.ArrayList;

public class TestHarness {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn= DriverManager.getConnection("jdbc:ucanaccess://C:/Users/robbi/Downloads/group3.accdb");
            Statement st = conn.createStatement();
            ResultSet rs= st.executeQuery("select dv.ID, d.DriverName, v.ViolationName, "
                    + "dv.ViolationDate, v.ViolationPenalty, v.ViolationFineAmt from "
                    + " DriverViolation dv, Driver d, Violation v " +
                    "where dv.DriverID=d.ID and dv.ViolationID = v.ID");
            while(rs.next()){
                System.out.println("Driver: " + rs.getString(2)
                        + "; Violation: " + rs.getString(3) +
                        "; Date Committed: " + rs.getString(4) +
                        "; Penalty Applicable: " + rs.getString(5) +
                        "; Fine to be Paid: " + rs.getString(6));
            }
            conn.commit();
            conn.close();
        }catch(Exception ee){System.out.println(ee);}

        LoginController lc = new LoginController();

    }
    
}
