import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * UC7: Sort Bogies by Capacity (Comparator)
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)\n");

        // Create list of passenger bogies
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("General", 90));

        // Before Sorting
        System.out.println("Before Sorting:");
        for (PassengerBogie b : bogies) {
            System.out.println(b.getType() + " -> " + b.getCapacity());
        }

        // Sort using Comparator (ascending order)
        Collections.sort(bogies, new CapacityComparator());

        // After Sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (PassengerBogie b : bogies) {
            System.out.println(b.getType() + " -> " + b.getCapacity());
        }

        System.out.println("\nUC7 sorting completed ...");
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

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

/**
 * ============================================================
 * CLASS - CapacityComparator
 * ============================================================
 */
class CapacityComparator implements Comparator<PassengerBogie> {

    @Override
    public int compare(PassengerBogie b1, PassengerBogie b2) {
        return b1.getCapacity() - b2.getCapacity(); // ascending
    }
}