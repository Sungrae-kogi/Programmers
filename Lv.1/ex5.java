//정수 내림차순으로 정렬하기

import java.util.Arrays;
import java.util.Collections;

//n +""으로 n을 문자열로 변환하고, split("")으로 문자열로 바꾼 뒤 Arrays.sort(list, Collections.reverseOrder()) 로 역순으로 정렬한 뒤 String.join("",list)으로
//다시 문자열로 합쳐주었다. 
public class ex5 {
    public long solution(long n) {
        long answer = 0;
        String num = ""+n;
        String[] list = num.split("");
        Arrays.sort(list, Collections.reverseOrder());
        
        String an = String.join("",list);
        return Long.parseLong(an);
    }


    //타인의 풀이, 정수를 문자열로 바꾸는 방법에 String.valueOf()도 있다.
    public long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
  }
}

//