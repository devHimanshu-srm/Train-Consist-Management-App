import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App - UC4 ===");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry Car at position 2 (index 2)
        train.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("After removing first and last: " + train);

        // Final output
        System.out.println("Final Train Consist: " + train);
    }
}