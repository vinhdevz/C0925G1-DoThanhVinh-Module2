package Case_Study.entity;

public class Contact {
    private String contactNumber;
    private String bookingCode;
    private double deposit;
    private double totalPayment;

    public Contact() {
    }

    public Contact(String contactNumber, String bookingCode, double deposit, double totalPayment) {
        this.contactNumber = contactNumber;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String toString() {
        return "Contact{" +
                "contactNumber = " + getContactNumber() +
                ", bookingCode = " + getBookingCode() +
                ", deposit = " + getDeposit() +
                ", totalPayment = " + getTotalPayment() +
                "}";
    }
}
