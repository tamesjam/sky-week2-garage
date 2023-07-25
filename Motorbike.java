public class Motorbike extends Vehicle{
    private boolean hasSideCar;

    public Motorbike(boolean isManned, int noOfSeats, int noOfWheels, boolean hasSideCar) {
        super(isManned, noOfSeats, noOfWheels);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public void ride() {
        System.out.println("Now riding the bike!");
    }

    public void wheelie() {
        System.out.println("WEEEEEEEEEEE! SO MUCH FUN!");
    }
}
