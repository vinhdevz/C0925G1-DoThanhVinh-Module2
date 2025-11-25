package ss19_string_regex_to_java.bai_tap;

public class PhoneNumberExampleTest {
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();

        String[] validPhone = {"(84)-(0978489648)", "(01)-(0123456788)"};
        String[] invalidPhone = {"(a8)-(22222222)", "(84)-(22b22222)"};

        System.out.println("===Số điện thoại hợp lệ===");
        for (String phone : validPhone) {
            System.out.println(phone + " : " + phoneNumberExample.validate(phone));
        }

        System.out.println("===Số điện thoại không hợp lệ===");
        for (String phone : invalidPhone) {
            System.out.println(phone + " : " + phoneNumberExample.validate(phone));
        }
    }
}
