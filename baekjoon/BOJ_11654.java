package baekjoon;

import java.util.Scanner;

public class BOJ_11654 {
    public static void main(String[] args){
        /* 
         방법 1

         입력으로 주어진 글자의 아스키 코드 값을 출력. 'A'의 ASCII 코드는 65이다. 
         만약 char 타입의 문자 '7' 을 정수값 7로 변환하고 싶다면 문자 '0'를 빼주면된다. -> '7' - '0' = 55 - 48 (ASCII번호)

         방법 2

         Character.getNumericValue()를 사용.
        */
        Scanner sc = new Scanner(System.in);
        
        char n = sc.nextLine().charAt(0);

        int a = (int)n;
        System.out.println(a);
        // System.out.println(Character.getNumericValue(n));    이건 아스키값이아니라 숫자를 가진 문자를 정수타입의 숫자로 바꾸는것.
    }
    
}
