package Case_Study.entity;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }
    public String getCustomerCode() {
        return customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id = " + getId() +
                ", name = " + getName() +
                ", dob = " + getDateOfBirth() +
                ", gender = " + getGender() +
                ", idCard = " + getIdCard() +
                ", phone = " + getPhoneNumber() +
                ", email = " + getEmail() +
                ", type = " + getCustomerType() +
                ", address = " + getAddress() +
                "}";
    }
}
