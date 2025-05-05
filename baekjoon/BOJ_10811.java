package baekjoon;

import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*지저분하게 풀었다고 생각되는 문제.
        * 뒤집을 범위를 부분 배열로 만들고 그 배열의 값에서 기존 배열의 값을 업데이트(뒤집는) 하는식으로
        */
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // 반복 횟수 M번
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 뒤집을 범위를 임시로 보유할 배열
            int[] arr_rev = new int[b - a + 1];

            // 뒤집을 범위에서 값을 가져옴. a-1인 이유는, 0번 인덱스 위치에 1의 값이 들어가므로
            for (int j = 0; j < arr_rev.length; j++) {
                arr_rev[j] = arr[a - 1 + j];
            }
            
            // 기존 배열 arr에 임시 배열의 값을 뒤에서부터 가져옴 -> arr_rev.length-1-j는 맨 뒤 index부터 j값이 늘어나므로 역순이 된다.
            for (int j = 0; j < arr_rev.length; j++) {
                arr[a - 1 + j] = arr_rev[arr_rev.length - 1 - j];
            }
        }

        /* 그외에 정보로는 List<> 를 뒤집는 Collections.reverse(list)가 존재함.  */

        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
