package app;

public class App {
    public static void main(String[] args) throws Exception {
        Drive driving = new Drive();
        Car car = new Car();
        Bike bike = new Bike();
        driving.setVehicle(car);
        driving.driveVehicle();

        driving.setVehicle(bike);
        driving.driveVehicle();
    }
}