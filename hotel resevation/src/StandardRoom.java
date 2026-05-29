public class StandardRoom extends Room {

    public StandardRoom(int roomNumber, double price) {
        super(roomNumber, price);
    }

    @Override
    public void displayRoomInfo() {
        System.out.println("Standard Room");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}