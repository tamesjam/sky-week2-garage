// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

//        Vehicle v1 = new Vehicle(true, 4, 4);

        Car c1 = new Car(true, 5, 4, true, 350, 5);
        Motorbike m1 = new Motorbike(true, 1, 2, false);
        Boat b1 = new Boat(true, 5, 0, true, 4, 1,3);

        Car c2 = new Car(true, 5, 4, true, 350, 5);
        Motorbike m2 = new Motorbike(true, 1, 2, false);
        Boat b2 = new Boat(true, 5, 0, true, 4, 1,3);

        Car c3 = new Car(true, 5, 4, true, 350, 5);
        Motorbike m3 = new Motorbike(true, 1, 2, false);
        Boat b3 = new Boat(true, 5, 0, true, 4, 1,3);

        garage.addVehicles(c1, m1, b1, c2, m2, b2, c3, m3, b3);

        // Print how the garage looks
        System.out.println(garage.toString());

        // Remove a vehicle by ID
        garage.removeVehicle(2);

        System.out.println(garage.toString());

        // Remove a vehicle by type now
        garage.removeVehicle("car");

        System.out.println(garage.toString());

        System.out.println("The total repair price is: " + garage.totalRepairPrice());

        // Create Plane and Bird objects
        Plane p1 = new Plane(true, 1500, 8, 4);
        Plane p2 = new Plane(true, 500, 6, 2);
        Bird bird1 = new Bird("Budgerigar", "Blue", false);
        Bird bird2 = new Bird("Eagle", "Brown", true);

        Flyable[] flyables_list = {p1, p2, bird1, bird2};
        for (Flyable fly: flyables_list) {
            fly.fly();
        }
    }
}