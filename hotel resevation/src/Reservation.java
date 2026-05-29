public class Reservation {

    private Customer customer;
    private Room room;
    private int days;

    public Reservation(Customer customer, Room room, int days) {
        this.customer = customer;
        this.room = room;
        this.days = days;
    }

    public double calculateBill() {
        return room.getPrice() * days;
    }

    public void displayReservation() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Days: " + days);
        System.out.println("Total Bill: " + calculateBill());
    }

    public Room getRoom() {
        return room;
    }
}

