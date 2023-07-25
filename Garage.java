import java.util.*;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage(Vehicle... vehicles) {
        this.vehicles = new ArrayList<>(List.of(vehicles)); // Arrays.asList() ?
    }

    public double repairPrice(Vehicle vehicle) {
        if(vehicle instanceof Car) {
            return 300.00;
        }else if(vehicle instanceof Motorbike) {
            return 200.00;
        }else if(vehicle instanceof Boat) {
            Boat b = (Boat) vehicle;
            return b.getMaxCrewSize() * 20;
        }

        return 100.00;
    }

    public void emptyGarage() {
        this.vehicles = new ArrayList<>();
    }

    public double totalRepairPrice() {
        double totRepairPrice = 0.00;
        for (Vehicle v: this.vehicles) {
            totRepairPrice += repairPrice(v);
        }

        return Math.round(totRepairPrice * 100.0) / 100.0;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        int index = vehicles.indexOf(vehicle);

        if (index >= 0)  {
            vehicles.remove(vehicle);
            return true;
        }
        return false;
    }

    public boolean removeVehicle(int vehicleID) {
        for(Vehicle v: this.vehicles) {
            if(v.getVehicleID() == vehicleID) {
                vehicles.remove(v);
                return true;
            }
        }
        return false;
    }

    public boolean removeVehicle(String vehicleType) {
        for (Vehicle v: this.vehicles) {
            String className = v.getClass().getSimpleName().toLowerCase();
            if(className.equals(vehicleType.toLowerCase())) {
                vehicles.remove(v);
            }
        }
        return true;
    }

    public boolean addVehicles(Vehicle... vehicles) {
        int size = this.vehicles.size() + vehicles.length;
        this.vehicles.addAll(List.of(vehicles));

//        for (Vehicle v: vehicles) {
//            vehicles.add(v);
//        }

        return size == this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public int size() {
        return vehicles.size();
    }

    @Override
    public String toString() {
        String str = "";
        for (Vehicle v : this.vehicles) {
            str += v.getClass().getSimpleName() + " " + v.getVehicleID() + " " + "\n";
        }
        return str;
    }
}
