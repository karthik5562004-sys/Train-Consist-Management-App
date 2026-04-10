import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC5 - Preserve Insertion Order of Bogies\n");

        Train train = new Train();

        // Adding bogies (including duplicates)
        train.addBogie("Engine");
        train.addBogie("Sleeper");
        train.addBogie("Cargo");
        train.addBogie("Guard");
        train.addBogie("Sleeper"); // duplicate (ignored)

        System.out.println("Final Train Formation:");
        System.out.println(train.getFormation());

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed ...");
    }
}

class Train {

    private Set<String> formation;

    public Train() {
        formation = new LinkedHashSet<>();
    }

    public void addBogie(String bogie) {
        formation.add(bogie); // maintains order + avoids duplicates
    }

    public Set<String> getFormation() {
        return formation;
    }
}