package baekjoon;

import java.util.Scanner;

public class BOJ_10811_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 뒤집기 횟수

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // a ~ b 구간을 뒤집기
            reverse(baskets, a - 1, b - 1);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
        // 양쪽에서 좁혀오는 범위를 제한할때 주로 사용하는 조건 while(start > end)
        while(start > end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
