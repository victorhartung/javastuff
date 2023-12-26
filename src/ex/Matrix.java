package ex;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(mat[i][i] + " ");

        }

        System.out.println();

        for(int i= 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }

        sc.close();
    }

}
