class Customer extends Person {

    private int customerId;

     Customer(String name, String phone, int customerId) {
        super(name, phone);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }
}
