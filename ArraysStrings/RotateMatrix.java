package ArraysStrings;

import java.util.Scanner;

public class RotateMatrix {

    Scanner sc = new Scanner(System.in);

    public void function(int n, int m[][]) {
        printMatrix(n, m);
        diagonalExchange(n, m);
        printMatrix(n, m);
        horizontalExchange(n, m);
        printMatrix(n, m);
    }

    public int[][] readMatrix(int n) {

        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        return matrix;
    }

    private void printMatrix(int n, int m[][]) {
        System.out.println("_______________________________");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("_______________________________");
    }

    private void diagonalExchange(int n, int m[][]) {
        int aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                aux = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = aux;
            }
        }
    }

    private void horizontalExchange(int n, int m[][]) {
        int aux;
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (n / 2); j++) {
                    aux = m[i][j];
                    m[i][j] = m[i][n - j - 1];
                    m[i][n - 1 - j] = aux;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    aux = m[i][j];
                    m[i][j] = m[i][n - j - 1];
                    m[i][n - 1 - j] = aux;
                }
            }
        }
    }

    public static void main(String args[]) {
        RotateMatrix cci = new RotateMatrix();

        cci.function(3, cci.readMatrix(3));

    }
}