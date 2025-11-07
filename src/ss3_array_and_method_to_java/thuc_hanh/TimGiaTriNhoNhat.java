package ss3_array_and_method_to_java.thuc_hanh;

public class TimGiaTriNhoNhat {
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 88, 1};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[index]);
    }
}
