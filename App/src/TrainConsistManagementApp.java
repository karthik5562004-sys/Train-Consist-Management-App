import java.util.*;
import java.util.stream.*;

/**
 * ============================================================
 * UC10 - Count Total Seats in Train (Stream reduce)
 * ============================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC10 - Count Total Seats in Train\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("Sleeper", 70));

        System.out.println("Bogies in Train:");
        bogies.forEach(b ->
                System.out.println(b.getType() + " -> " + b.getCapacity()));

        // ✅ map() + reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);   // aggregate sum

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 aggregation completed ...");
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