package baekjoon;

import java.util.Scanner;

public class BOJ_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] += sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }
}
