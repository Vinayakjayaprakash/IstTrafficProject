package ViolationManagement;

public class Violation {

    public String violationId;
    public String driverId;
    public String vehicleId;

    public String violationType;
    public String timestamp;

    public Violation(String violationId, String driverId, String vehicleId, String violationType, String timestamp) {
        this.violationId = violationId;
        this.driverId = driverId;
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.timestamp = timestamp;
    }

}
