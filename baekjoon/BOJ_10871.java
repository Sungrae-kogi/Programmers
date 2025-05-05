package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        // Stream 방식 -> 배열이나 컬렉션의 데이터를 일련의 파이프라인과정을 통해 처리하는 방식.
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)    // 문자열을 정수로
                .toArray();                     // 다시 정수 배열로

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();

            if (A[i] < X)
                System.out.print(A[i] + " ");
        }
    }
}
