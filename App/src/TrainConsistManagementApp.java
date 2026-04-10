import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * UC4: Maintain Ordered Bogie Consist
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC4 - Maintain Ordered Bogie Consist\n");

        Train train = new Train();

        // Initial consist
        train.addBogie("Engine");
        train.addBogie("Sleeper");
        train.addBogie("AC");
        train.addBogie("Cargo");
        train.addBogie("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train.getBogies());

        // Insert at position 2
        train.insertBogieAt(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(train.getBogies());

        // Remove first and last
        train.removeFirstBogie();
        train.removeLastBogie();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train.getBogies());

        System.out.println("\nUC4 ordered consist operations completed ...");
    }
}

/**
 * ============================================================
 * CLASS - Train
 * ============================================================
 */
class Train {

    private LinkedList<String> bogies;

    public Train() {
        bogies = new LinkedList<>();
    }

    public void addBogie(String bogie) {
        bogies.add(bogie);
    }

    public void insertBogieAt(int index, String bogie) {
        bogies.add(index, bogie);
    }

    public void removeFirstBogie() {
        bogies.removeFirst();
    }

    public void removeLastBogie() {
        bogies.removeLast();
    }

    public LinkedList<String> getBogies() {
        return bogies;
    }
}