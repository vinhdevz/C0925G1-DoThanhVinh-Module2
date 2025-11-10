package ss3_array_and_method_to_java.bai_tap;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        double [][] matrix = {
                {1.2, 2.3, 3.4},
                {2.3, 4.3, 5,2},
                {3.4, 1.2, 4.1}
        };

        System.out.println("Ma trận hiện tại: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tổng các phần tử ở đường chéo chính: " + sum);
    }
}
