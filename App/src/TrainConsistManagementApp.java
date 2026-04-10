import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC3 - Track Unique Bogie IDs\n");

        Train train = new Train();

        // Adding bogie IDs (including duplicates)
        train.addBogieId("BG101");
        train.addBogieId("BG102");
        train.addBogieId("BG103");
        train.addBogieId("BG104");
        train.addBogieId("BG101"); // duplicate
        train.addBogieId("BG102"); // duplicate

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(train.getBogieIds());

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed ...");
    }
}

class Train {

    private Set<String> bogieIds;

    public Train() {
        bogieIds = new HashSet<>();
    }

    public void addBogieId(String id) {
        bogieIds.add(id); // HashSet ignores duplicates automatically
    }

    public Set<String> getBogieIds() {
        return bogieIds;
    }
}