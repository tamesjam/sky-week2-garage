public class Plane extends Vehicle implements Flyable{
    private int numOfEngines;

    public Plane(boolean isManned, int noOfSeats, int noOfWheels, int numOfEngines) {
        super(isManned, noOfSeats, noOfWheels);
        this.numOfEngines = numOfEngines;
    }

    public double getRepairPrice() {
        return this.numOfEngines * 500;
    }

    public void fly() {
        System.out.println("I am flying in a plane!");
    }
}
