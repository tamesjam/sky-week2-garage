import java.util.*;

public class Vehicle {
    private boolean isManned;
    private int noOfSeats;
    private int noOfWheels;

    private boolean isEngineOn = false;

    private final int vehicleID;
    private static int nextID = 0;

    public Vehicle(boolean isManned, int noOfSeats, int noOfWheels) {
        this.isManned = isManned;
        this.noOfSeats = noOfSeats;
        this.noOfWheels = noOfWheels;

        this.vehicleID = nextID;
        nextID++;
    }

    public void start() {
        if (!isEngineOn) {
            System.out.println("Starting engine!");
            isEngineOn = !isEngineOn;
        }
    }

    public void stop() {
        if (isEngineOn) {
            System.out.println("Stopping engine!");
            isEngineOn = !isEngineOn;
        }
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public boolean isManned() {
        return isManned;
    }

    public void setManned(boolean manned) {
        isManned = manned;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
