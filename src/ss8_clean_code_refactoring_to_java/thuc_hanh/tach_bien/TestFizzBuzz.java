package ss8_clean_code_refactoring_to_java.thuc_hanh.tach_bien;

public class TestFizzBuzz {
    public static void testFizz3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);

        if (result.equals(expected)){
            System.out.println("Test Fizz(3) => Pass");
        } else {
            System.out.println("Test Fizz(3) Fail => result: " + result + ", expected: " + expected);
        }
    }
    public static void testBuzz5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);

        if (result.equals(expected)){
            System.out.println("Test Buzz(5) => Pass");
        } else {
            System.out.println("Test Buzz(5) Fail => result: " + result + ", expected: " + expected);
        }
    }

    public static void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);

        if (result.equals(expected)){
            System.out.println("Test FizzBuzz(15) => Pass");
        } else {
            System.out.println("Test FizzBuzz(15) Fail => result: " + result + ", expected: " + expected);
        }
    }

    public static void main(String[] args) {
        testFizz3();
        testBuzz5();
        testFizzBuzz15();;
    }

}
