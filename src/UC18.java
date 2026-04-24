import java.util.Scanner;

public class UC18 {

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B412", "B550"};

        Scanner scanner = new Scanner(System.in);

        // Step 2: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID found!");
        } else {
            System.out.println("Bogie ID NOT found.");
        }

        scanner.close();
    }
}