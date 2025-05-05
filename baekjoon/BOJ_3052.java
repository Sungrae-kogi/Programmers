package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Set 사용 익히기. 
        Set<Integer> arr = new HashSet<>();

        for(int i=0; i<10; i++){
            arr.add(sc.nextInt()%42);
        }
        
        System.out.println(arr.size());
    }
}
