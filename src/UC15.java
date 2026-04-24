public class UC15 {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("G1", "RECTANGULAR");

        // Unsafe case
        b1.assignCargo("PETROLEUM");

        System.out.println("------");

        // Safe case
        GoodsBogie b2 = new GoodsBogie("G2", "CYLINDRICAL");
        b2.assignCargo("PETROLEUM");

        System.out.println("Program continues safely...");
    }
}