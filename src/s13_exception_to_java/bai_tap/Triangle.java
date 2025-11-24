package s13_exception_to_java.bai_tap;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws ITriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new ITriangleException("Cạnh tam giác phải lớn hơn 0");
        }
        if (a + b <= 0 || a + c <= b || b + c <= 0) {
            throw new ITriangleException("Tổng 2 cạnh phải lớn hơn 2 cạnh còn lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
