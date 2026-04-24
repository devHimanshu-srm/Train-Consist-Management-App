public class GoodsBogie {

    private String id;
    private String shape; // e.g., RECTANGULAR, CYLINDRICAL
    private String cargo;

    public GoodsBogie(String id, String shape) {
        this.id = id;
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {

        try {
            // Rule: Petroleum cannot be in rectangular bogie
            if (cargoType.equalsIgnoreCase("PETROLEUM") &&
                    shape.equalsIgnoreCase("RECTANGULAR")) {

                throw new CargoSafetyException(
                        "Unsafe cargo assignment: Petroleum cannot be stored in Rectangular bogie");
            }

            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for bogie: " + id);
        }
    }
}