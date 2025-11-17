package ss8_clean_code_refactoring_to_java.thuc_hanh.doi_ten_bien_va_tach_hang;

import static ss8_clean_code_refactoring_to_java.thuc_hanh.doi_ten_bien_va_tach_hang.Calculator.*;

public class CalculatorTest {
    public static void TestCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 4;
        char operator = ADDITION;
        int expected = 5;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Test Pass => result = " + result);
        } else {
            System.out.println("Test Fail => result = " + result + ", expected = " + expected);
        }
    }

    public static void TestCalculateSub() {
        int firstOperand = 5;
        int secondOperand = 4;
        char operator = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Test Pass => result = " + result);
        } else {
            System.out.println("Test Fail => result = " + result + ", expected = " + expected);
        }
    }

    public static void TestCalculateMul() {
        int firstOperand = 5;
        int secondOperand = 4;
        char operator = MULTIPLICATION;
        int expected = 21;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Test Pass => result = " + result);
        } else {
            System.out.println("Test Fail => result = " + result + ", expected = " + expected);
        }
    }

    public static void TestCalculateDiv() {
        int firstOperand = 10;
        int secondOperand = 5;
        char operator = DIVISION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("Test Pass => result = " + result);
        } else {
            System.out.println("Test Fail => result = " + result + ", expected = " + expected);
        }
    }

    public static void TestCalculateDivByZero() {
        int firstOperand = 10;
        int secondOperand = 0;
        char operator = DIVISION;

        try {
            Calculator.calculate(firstOperand, secondOperand, operator);
            System.out.println("Test DivByZero Fail => expected expected but got result");
        } catch (RuntimeException e) {
            System.out.println("Test DivByZero Pass => caught exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TestCalculateAdd();
        TestCalculateSub();
        TestCalculateMul();
        TestCalculateDiv();
        TestCalculateDivByZero();
    }
}
