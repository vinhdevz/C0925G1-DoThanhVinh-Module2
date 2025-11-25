package ss19_string_regex_to_java.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
//    - Viết phương thức để kiểm tra tính hợp lệ của tên một lớp học.
//    - Tên một lớp học hợp lệ cần đạt các yêu cầu sau:
//    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
//    Không chứa các ký tự đặc biệt
//    Theo sau ký tự bắt đầu là 4 ký tự số
//    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K
//- Ví dụ:
//    - Tên lớp hợp lệ: C0223G, A0323K
//    - Tên lớp không hợp lệ: M0318G, P0323A

    private static final String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public boolean validate(String className) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

}
