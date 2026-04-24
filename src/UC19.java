import java.util.Arrays;
import java.util.Scanner;

public class UC19 {

    public static void main(String[] args) {

        // Step 1: Sorted array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B412", "B550"};

        // (Safety) Ensure sorted
        Arrays.sort(bogieIds);

        Scanner scanner = new Scanner(System.in);

        // Step 2: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        // Step 3: Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                System.out.println("Bogie ID found at index: " + mid);
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        if (!found) {
            System.out.println("Bogie ID NOT found.");
        }

        scanner.close();
    }
}