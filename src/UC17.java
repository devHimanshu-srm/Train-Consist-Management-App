import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC",
                "General",
                "FirstClass",
                "SecondSeating"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 2: Sort using built-in method
        Arrays.sort(bogieNames);

        // Step 3: Display result
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}