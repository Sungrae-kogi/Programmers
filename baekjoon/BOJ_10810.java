package baekjoon;

import java.util.Scanner;

public class BOJ_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] box = new int[N];
        for (int count = 0; count < M; count++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int p=i-1; p<j; p++){
                box[p] = k;
            }
        }
        
        // 출력
        for(int count = 0; count < N; count++){
            System.out.printf(box[count]+" ");
        }
    }
}
