import java.util.*;
import java.util.stream.*;

/**
 * ============================================================
 * UC12 - Safety Compliance Check for Goods Bogies
 * ============================================================
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("UC12 - Safety Compliance Check for Goods Bogies\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("CyLindrical", "Coal")); // invalid

        System.out.println("Goods Bogies in Train:");
        bogies.forEach(b ->
                System.out.println(b.getType() + " -> " + b.getCargo()));

        // ✅ Safety Rule: Cylindrical → only Petroleum
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );

        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed ...");
    }
}

/**
 * ============================================================
 * CLASS - GoodsBogie
 * ============================================================
 */
class GoodsBogie {

    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }
}