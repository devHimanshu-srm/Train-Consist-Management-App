import java.util.ArrayList;
import java.util.List;

public class UC1 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (Empty List)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial State
        System.out.println("Train consist initialized.");

        // Display Bogie Count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready for operations.");
    }
}