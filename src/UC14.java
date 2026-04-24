public class UC14 {

    public static void main(String[] args) {

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("B1", 50);
            System.out.println("Created: " + b1);

            // Invalid bogie
            PassengerBogie b2 = new PassengerBogie("B2", -10);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}