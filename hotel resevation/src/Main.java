import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel();

        // Sample rooms
        hotel.addRoom(new StandardRoom(101, 1000));
        hotel.addRoom(new DeluxeRoom(201, 2500));

        int choice;

        do {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    hotel.viewRooms();
                    break;

                case 2:
                    input.nextLine();

                    System.out.print("Enter customer name: ");
                    String name = input.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = input.nextLine();

                    System.out.print("Enter customer ID: ");
                    int customerId = input.nextInt();

                    Customer customer = new Customer(name, phone, customerId);

                    System.out.print("Enter room number to book: ");
                    int roomNumber = input.nextInt();

                    System.out.print("Enter number of days: ");
                    int days = input.nextInt();

                    hotel.bookRoom(customer, roomNumber, days);
                    break;

                case 3:
                    System.out.print("Enter room number to cancel reservation: ");
                    int cancelRoom = input.nextInt();

                    hotel.cancelReservation(cancelRoom);
                    break;

                case 4:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}