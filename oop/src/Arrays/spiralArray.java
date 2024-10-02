package Arrays;

public class spiralArray {
    public static void main1(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int value = 1;

        while (value <= n * n) {

            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x = 50;
        while(true) {
            if (x % 4 == 1) {
                x += 2;
            }
            else if (x % 4 == 2) {
                x-= 1;
            }
            else if (x % 4 == 3) {
                x /= 10;
            }
            else break;
        }
        System.out.println(x);
    }
}
