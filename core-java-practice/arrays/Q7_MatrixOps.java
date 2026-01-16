package Day3;

import java.util.Scanner;

public class Q7_MatrixOps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial setup: Reading dimensions and matrices
        System.out.print("Enter rows and columns for matrices (2-10): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter Matrix A:");
        int[][] A = readMatrix(r, c, sc);
        System.out.println("Enter Matrix B:");
        int[][] B = readMatrix(r, c, sc);

        while (true) {
            System.out.println("\n--- MATRIX OPERATIONS MENU ---");
            System.out.println("1) Add\n2) Subtract\n3) Multiply (A * B)\n4) Transpose (A)\n5) Row/Column Sums (A)\n6) Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition Result:");
                    printMatrix(add(A, B));
                    break;
                case 2:
                    System.out.println("Subtraction Result:");
                    printMatrix(subtract(A, B));
                    break;
                case 3:
                    
                    if (c != r) {
                        System.out.println("Error: Columns of A must equal Rows of B.");
                    } else {
                        System.out.println("Multiplication Result:");
                        printMatrix(multiply(A, B));
                    }
                    break;
                case 4:
                    System.out.println("Transpose of A:");
                    printMatrix(transpose(A));
                    break;
                case 5:
                    printSums(A);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int[][] readMatrix(int r, int c, Scanner sc) {
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] add(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }

    private static int[][] subtract(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = A[i][j] - B[i][j];
            }
        }
        return res;
    }


    private static int[][] multiply(int[][] A, int[][] B) {
        int r1 = A.length, c1 = A[0].length, c2 = B[0].length;
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }

    private static int[][] transpose(int[][] A) {
        int r = A.length, c = A[0].length;
        int[][] res = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }

    private static void printSums(int[][] A) {
        // Row sums
        for (int i = 0; i < A.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < A[0].length; j++) rowSum += A[i][j];
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum);
        }
        // Column sums
        for (int j = 0; j < A[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < A.length; i++) colSum += A[i][j];
            System.out.println("Column " + (j + 1) + " Sum: " + colSum);
        }
    }
}