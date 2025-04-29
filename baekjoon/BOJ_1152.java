package baekjoon;

import java.util.Scanner;

public class BOJ_1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        String[] str = s.split(" ");

        //입력이 공백만 입력된 경우 str의 길이가 1인 [""] 배열이 생성이된다.
        //따라서 이것에 대한 처리를 하는데 isEmpty() 를 사용.
        if(s.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(str.length);
        }
    }
}
