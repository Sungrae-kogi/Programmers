package baekjoon;

import java.util.Scanner;

public class BOJ_9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        /*
         * 문자열을 배열로 바꾸는방법.  String to String[]
         * String[] arr = StringArr.split("");
         * 
         * 또한 문자열을 char타입 배열로 바꾸는 방법. String to char[]
         * char[] charArr = StringArr.toCharArray();        - 이 방법은 char타입이므로 주로 ASCII 코드로 변환할 때 사용.
         */
        for(int i=0; i<T; i++){
            String[] StringArr = sc.nextLine().split("");
            System.out.println(StringArr[0]+StringArr[StringArr.length-1]);
        }
    }    
}
