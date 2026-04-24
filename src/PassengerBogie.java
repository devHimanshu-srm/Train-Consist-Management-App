public class PassengerBogie {

    private String id;
    private int capacity;

    public PassengerBogie(String id, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0");
        }

        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Capacity: " + capacity;
    }
}