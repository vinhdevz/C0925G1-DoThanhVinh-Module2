package ss3_array_and_method_to_java.bai_tap;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {3,5,7},
                {4,6,8}
        };

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
