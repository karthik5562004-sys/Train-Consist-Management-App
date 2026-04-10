import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC2 - Add Passenger Bogies to Train\n");

        Train train = new Train(8);

        // Add bogies
        train.addBogie("Sleeper");
        train.addBogie("AC Chair");
        train.addBogie("First Class");

        // After adding
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + train.getBogies());

        // Remove bogie
        train.removeBogie("AC Chair");

        System.out.println("\nAfter Removing \"AC Chair':");
        System.out.println("Passenger Bogies : " + train.getBogies());

        // Check existence
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + train.containsBogie("Sleeper"));

        // Final consist
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(train.getBogies());

        System.out.println("\nUC2 operations completed successfully ...");
    }
}

class Train {

    private int maxCapacity;
    private List<String> bogies;

    public Train(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.bogies = new ArrayList<>();
    }

    public void addBogie(String bogieType) {
        if (bogies.size() < maxCapacity) {
            bogies.add(bogieType);
        }
    }

    public void removeBogie(String bogieType) {
        bogies.remove(bogieType);
    }

    public boolean containsBogie(String bogieType) {
        return bogies.contains(bogieType);
    }

    public List<String> getBogies() {
        return bogies;
    }
}