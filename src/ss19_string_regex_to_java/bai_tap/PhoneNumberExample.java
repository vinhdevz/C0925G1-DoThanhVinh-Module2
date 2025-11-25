package ss19_string_regex_to_java.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public boolean validate(String phone) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
