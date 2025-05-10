package baekjoon;

import java.util.List;
import java.util.Scanner;

public class BOJ_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.nextLine().toCharArray();
        int front = 0;
        int back = s.length-1;
        boolean flag = true;
        while(front < back){
            if(s[front] != s[back]){
                flag = false;
                break;
            }
            front++;
            back--;
        }

        if(flag){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}
