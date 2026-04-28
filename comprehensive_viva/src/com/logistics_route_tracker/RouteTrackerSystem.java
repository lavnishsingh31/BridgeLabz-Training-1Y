package routetracker;

public class RouteTrackerSystem {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.addCheckpoint(new DeliveryCheckpoint("C101", "Warehouse A", 30.0, 50, 60));
        driver.addCheckpoint(new FuelCheckpoint("C102", "Pump 12", 20.0, 15, 15));
        driver.addCheckpoint(new RestCheckpoint("C103", "Motel X", 10.0, 40, 45));
        driver.addCheckpoint(new DeliveryCheckpoint("C104", "Client Hub", 60.0, 45, 60));

        driver.printDriverReport();
    }
}
