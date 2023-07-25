public class Boat extends Vehicle{
    private boolean hasRadar;
    private int numOfSails;
    private int minCrewSize;
    private int maxCrewSize;
    private boolean isMoored = true;

    public Boat(boolean isManned, int noOfSeats, int noOfWheels, boolean hasRadar, int numOfSails, int minCrewSize, int maxCrewSize) {
        super(isManned, noOfSeats, noOfWheels);
        this.hasRadar = hasRadar;
        this.numOfSails = numOfSails;

        if (maxCrewSize < minCrewSize) throw new IllegalArgumentException();
        this.maxCrewSize = maxCrewSize;
        this.minCrewSize = minCrewSize;
    }

    public void sail() {
        if (this.isMoored) {
            System.out.println("Setting sail now!");
            this.isMoored = !this.isMoored;
        }
    }

    public void moorBoat() {
        if (!this.isMoored) {
            System.out.println("Mooring boat now!");
            this.isMoored = !this.isMoored;
        }
    }

    public boolean isHasRadar() {
        return hasRadar;
    }

    public void setHasRadar(boolean hasRadar) {
        this.hasRadar = hasRadar;
    }

    public int getNumOfSails() {
        return numOfSails;
    }

    public void setNumOfSails(int numOfSails) {
        this.numOfSails = numOfSails;
    }

    public int getMinCrewSize() {
        return minCrewSize;
    }

    public void setMinCrewSize(int minCrewSize) {
        this.minCrewSize = minCrewSize;
    }

    public int getMaxCrewSize() {
        return maxCrewSize;
    }

    public void setMaxCrewSize(int maxCrewSize) {
        this.maxCrewSize = maxCrewSize;
    }

    public boolean isMoored() {
        return isMoored;
    }

    public void setMoored(boolean moored) {
        isMoored = moored;
    }
}
