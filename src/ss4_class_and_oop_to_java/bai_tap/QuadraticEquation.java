package ss4_class_and_oop_to_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = scanner.nextDouble();

        System.out.print("Nhập b:");
        double b = scanner.nextDouble();

        System.out.print("Nhập c:");
        double c = scanner.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double delta = qe.getDiscriminant();

        if(delta > 0){
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = " + qe.getRoot1());
            System.out.println("x2 = " + qe.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: ");
            System.out.println("x1 = x2 = " + qe.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
