public class Car extends Vehicle{
    private boolean isAutomatic;
    private boolean isBootOpen = false;
    private int bootSpace;
    private int noOfDoors;

    public Car(boolean isManned, int noOfSeats, int noOfWheels, boolean isAutomatic, int bootSpace, int noOfDoors) {
        super(isManned, noOfSeats, noOfWheels);
        this.isAutomatic = isAutomatic;
        this.bootSpace = bootSpace;
        this.noOfDoors = noOfDoors;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public boolean isBootOpen() {
        return isBootOpen;
    }

    public void setBootOpen(boolean bootOpen) {
        isBootOpen = bootOpen;
    }

    public int isBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void drive() {
        System.out.println("Engine is now turned on!");
    }

    public void openBoot() {
        if (!this.isBootOpen) this.isBootOpen = !this.isBootOpen;
    }

    public void closeBoot() {
        if (this.isBootOpen) this.isBootOpen = !this.isBootOpen;
    }
}
