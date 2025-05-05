package baekjoon;

import java.util.Scanner;

public class BOJ_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // 초기화
        int[] box = new int[N];
        for (int i = 0; i < N; i++) {
            box[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 변수 값 교환
            swap(box, a, b);
        }

        for (int i=0; i<N; i++){
            System.out.print(box[i]+" ");
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = 0;
        temp = arr[a - 1];
        arr[a - 1] = arr[b - 1];
        arr[b - 1] = temp;
    }
}
