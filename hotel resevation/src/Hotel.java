import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void viewRooms() {

        for (Room room : rooms) {
            room.displayRoomInfo();
            System.out.println("------------------");
        }
    }

    public void bookRoom(Customer customer, int roomNumber, int days) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {

                room.setAvailable(false);

                Reservation reservation =
                        new Reservation(customer, room, days);

                reservations.add(reservation);

                System.out.println("Room booked successfully!");
                reservation.displayReservation();
                return;
            }
        }

        System.out.println("Room not available.");
    }

    public void cancelReservation(int roomNumber) {

        for (Reservation reservation : reservations) {

            if (reservation.getRoom().getRoomNumber() == roomNumber) {

                reservation.getRoom().setAvailable(true);

                reservations.remove(reservation);

                System.out.println("Reservation cancelled.");
                return;
            }
        }

        System.out.println("Reservation not found.");
    }
}