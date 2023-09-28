public class Vehicle {

    private int distanceLeft;
    private int ageLimit;
    private String type;
    private int driveDistance;

    private Driver driver;

    public Vehicle(String type, int distanceLeft, int ageLimit, int driveDistance) {
        this.type = type;
        this.distanceLeft = distanceLeft;
        this.ageLimit = ageLimit;
        this.driveDistance = driveDistance;
        System.out.println(type + " created. " + distanceLeft + " miles to go!");
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver currentDriver) {
        if(currentDriver.getAge() < ageLimit) {
            System.out.println("Driver not changed! " + currentDriver.getName() + " is " + currentDriver.getAge() + ", but must be " + ageLimit + " or older to drive " + type);
        } else {
            this.driver = currentDriver;
            System.out.println("Driver changed to " + driver.getName());
        }

    }


    public void drive() {
        if(driver != null) {
            distanceLeft -= driveDistance;
            System.out.println(type + " drove " + driveDistance + " miles - " + distanceLeft + " miles to go");

        } else {
            System.out.println(type + " didn't drive - there is no driver!");
        }
    }

}
