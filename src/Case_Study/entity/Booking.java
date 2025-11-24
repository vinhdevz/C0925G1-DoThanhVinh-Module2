package Case_Study.entity;


import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingCode;
    private String bookingDate;
    private String startDate;
    private String endDate;
    private String customerCode;
    private String serviceCode;

    public Booking() {
    }

    public Booking(String bookingCode, String bookingDate, String startDate,
                   String endDate, String customerCode, String serviceCode) {
        this.bookingCode = bookingCode;
        this.bookingDate = bookingDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public int compareTo(Booking o) {
        int cmp = this.startDate.compareTo(o.startDate);
        return cmp != 0 ? cmp : this.endDate.compareTo(o.endDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return bookingCode.equals(booking.bookingCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode);
    }

    @Override
    public String toString() {
        return String.format("Booking{mã=%-8s | đặt=%-10s | từ=%-10s → %-10s | KH=%-8s | DV=%s}",
                bookingCode,
                formatDate(bookingDate),
                formatDate(startDate),
                formatDate(endDate),
                customerCode,
                serviceCode
        );
    }

    private String formatDate(String yyyy_MM_dd) {
        if (yyyy_MM_dd == null || !yyyy_MM_dd.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return yyyy_MM_dd;
        }
        String[] p = yyyy_MM_dd.split("-");
        return p[2] + "/" + p[1] + "/" + p[0]; // 2025-12-20 → 20/12/2025
    }
}