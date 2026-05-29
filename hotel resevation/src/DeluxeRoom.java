public class DeluxeRoom extends Room {

    public DeluxeRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }

    @Override
    public void displayRoomInfo() {
        System.out.println("Deluxe Room");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}
