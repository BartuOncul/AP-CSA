import java.util.Scanner;

public class Matrix 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first 3x3 matrix
        System.out.println("Enter matrix1 (3x3):");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        // Input the second 3x3 matrix
        System.out.println("Enter matrix2 (3x3):");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Multiply the matrices
        double[][] result = multiplyMatrix(matrix1, matrix2);

        // Display the resulting matrix
        System.out.println("The multiplication of the matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.1f ", result[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[3][3];

        // Matrix multiplication logic
        for (int i = 0; i < 3; i++) { // For each row of a
            for (int j = 0; j < 3; j++) { // For each column of b
                for (int k = 0; k < 3; k++) { // Summing over the inner dimension
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}
