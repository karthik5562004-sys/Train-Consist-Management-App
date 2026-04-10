/**
 * ============================================================
 * UC14 - Handle Invalid Bogie Capacity (Custom Exception)
 * ============================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC14 - Handle Invalid Bogie Capacity\n");

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.getType() + " -> " + b1.getCapacity());

            // ❌ Invalid Bogie
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed ...");
    }
}

/**
 * ============================================================
 * CUSTOM EXCEPTION CLASS
 * ============================================================
 */
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
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

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // ✅ FAIL-FAST VALIDATION
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }
}