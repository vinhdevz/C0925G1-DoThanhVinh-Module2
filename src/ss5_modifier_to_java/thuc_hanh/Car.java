package ss5_modifier_to_java.thuc_hanh;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda3", "Sky3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Toyoky6", "Sky6");
        System.out.println(Car.numberOfCar);
    }
}
