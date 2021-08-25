package ArraysStrings;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class ZeroMatrix {

    int matrix[][];
    int n, m;
    Scanner sc = new Scanner(System.in);
    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> columns = new HashSet<Integer>();

    private void readMatrix() {

        System.out.println("Rows : ");
        m = sc.nextInt();
        System.out.println("Columns : ");
        n = sc.nextInt();

        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private void lookForZeros() {
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 0) {
                    rows.add(row);
                    columns.add(col);
                }
            }
        }
    }

    private void replace() {
        columns.forEach(number -> {
            for (int i = 0; i < m; i++) {
                matrix[i][number] = 0;
            }
        });

        rows.forEach(number -> {
            for (int i = 0; i < n; i++) {
                matrix[number][i] = 0;
            }
        });
    }

    private void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[ " + matrix[i][j] + " ]");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    public void function() {
        readMatrix();
        printMatrix();
        lookForZeros();
        System.out.println("rows: ");
        rows.forEach(e -> {
            System.out.println(e);
        });
        System.out.println("col: ");
        columns.forEach(e -> {
            System.out.println(e);
        });

        replace();
        printMatrix();
    }

    public static void main(String args[]) {
        ZeroMatrix cci = new ZeroMatrix();
        cci.function();
    }
}
