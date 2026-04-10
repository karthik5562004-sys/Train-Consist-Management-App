import java.util.*;
import java.util.stream.Collectors;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * UC8: Filter Passenger Bogies Using Streams
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC8 - Filter Passenger Bogies Using Streams\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("General", 90));

        System.out.println("ALL Bogies:");
        bogies.forEach(b ->
                System.out.println(b.getType() + " -> " + b.getCapacity()));

        // Filter using Streams (capacity > 60)
        List<PassengerBogie> filtered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(b ->
                System.out.println(b.getType() + " -> " + b.getCapacity()));

        System.out.println("\nUC8 filtering completed ...");
    }
}

/**
 * ============================================================
 * CLASS - PassengerBogie
 * ============================================================
 */
class PassengerBogie {

    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }
}