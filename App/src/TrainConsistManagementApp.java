import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * UC1: Initialize Train and Display Consist Summary
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize train
        Train train = new Train(8);

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + train.getMaxCapacity());
        System.out.println("Current Train Consist: " + train.getBogies());

        System.out.println("System ready for operations...");
    }
}

/**
 * ============================================================
 * CLASS - Train
 * ============================================================
 *
 * Represents the train consist
 */
class Train {

    private int maxCapacity;
    private List<String> bogies;

    public Train(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.bogies = new ArrayList<>();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<String> getBogies() {
        return bogies;
    }
}