import java.util.*;
import java.util.stream.Collectors;

/**
 * ============================================================
 * UC9 - Group Bogies by Type (Collectors.groupingBy)
 * ============================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC9 - Group Bogies by Type\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("Sleeper", 70));
        bogies.add(new PassengerBogie("AC Chair", 60));

        System.out.println("ALL Bogies:");
        bogies.forEach(b ->
                System.out.println(b.getType() + " -> " + b.getCapacity()));

        // ✅ GROUPING USING STREAMS
        Map<String, List<PassengerBogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(PassengerBogie::getType));

        System.out.println("\nGrouped Bogies:");

        grouped.forEach((type, list) -> {
            System.out.println(type + " :");
            list.forEach(b ->
                    System.out.println("   " + b.getCapacity()));
        });

        System.out.println("\nUC9 grouping completed ...");
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