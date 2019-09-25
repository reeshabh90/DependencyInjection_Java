package app;

/**
 * Drive
 */
public class Drive {

    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void driveVehicle(){
        this.vehicle.drive();
    }
    
}