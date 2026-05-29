public class Admin extends Person {

    public Admin(String name, String phone) {
        super(name, phone);
    }

    public void manageHotel() {
        System.out.println("Admin managing hotel.");
    }
}
