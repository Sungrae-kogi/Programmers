package baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int max_idx = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());

            if (arr[i] > max) {
                max = arr[i];
                max_idx = i;
            }
        }

        // 최대값을 구했을때 배열에서 그 값의 idx를 구하는 방법으로 indexOf()도 있다.
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        

        System.out.println(max);
        System.out.println(max_idx+1);

        System.out.println("IndexOf() 사용 결과 : " + list.indexOf(max+1));
    }
}
