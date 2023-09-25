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

    public String getType() {
        return type;
    }

    public int getMileage() {
        return distanceLeft;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setDriver(Driver d) {
        if(d.getAge()<ageLimit) {
            System.out.println("Driver not changed! " + d.getName() + " is " + d.getAge() + ", but must be " + ageLimit + " or older to drive " + type);
        } else {
            driver=d;
            System.out.println("Driver changed to " + d.getName());
        }

    }


    public void drive() {
        if(driver != null) {
            distanceLeft=distanceLeft-driveDistance;
            System.out.println(type + " drove " + driveDistance + " miles - " + distanceLeft + " miles to go");

        } else {
            System.out.println(type + " didn't drive - there is no driver!");
        }
    }

}
