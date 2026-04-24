import java.util.ArrayList;
import java.util.List;

public class UC20 {

    public static void main(String[] args) {

        // Step 1: Create bogie collection (EMPTY case)
        List<String> bogieIds = new ArrayList<>();

        try {
            searchBogie(bogieIds, "B101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }

    public static void searchBogie(List<String> bogies, String key) {

        // Fail-Fast Check
        if (bogies == null || bogies.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train.");
        }

        // (Normal search logic – simple linear search)
        boolean found = false;

        for (String id : bogies) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie found!");
        } else {
            System.out.println("Bogie NOT found.");
        }
    }
}