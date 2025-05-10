package baekjoon;

import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toUpperCase();

        // 알파벳 등장 횟수
        char[] alpha = new char[26];

        for(int i=0; i<s.length(); i++){
            // 원래는 for문으로 alpha 배열을 돌면서 index를 찾았지만 char 타입의 특성을 이용해서 (char - 'A') index를 탐색
            char c = s.charAt(i);
            // 여기서 c는 'A' ~ 'Z'중 하나이니까 -'A'하면 인덱스 값이 나온다.
            alpha[c-'A']++;
        }

        int max = -1;
        char result = '?';
        for(int i=0; i<alpha.length; i++){
            if(alpha[i] > max){
                max = alpha[i];
                result = (char) (i + 'A');
            }else if(max == alpha[i]){
                //다음 루프에서 max 설정한 값이 또 있다면(중복이라면) 최소 i=1부터 max가 -1이 아닐테니까
                result = '?';
            }
        }

        System.out.println(result);

    }
}
