//3진법 뒤집기

import java.util.ArrayList;
import java.util.List;

//제곱값 Math.pow(), ArrayList에서 특정 index의 값을 가져오는방법은 .get(index) 함수로 가져와야함.

//10진수로 변환방법에 Integer.parseInt("string", n진수)의 기능도 있다.

public class ex26 {
    public int solution(int n) {
        List<Integer> num = new ArrayList<>();
        
        
        while(n>=3){
            num.add(n%3);
            n = n/3;
        }
        num.add(n);
        
        int sum =0;
        for(int i=0; i<num.size(); i++){
            int res = (int) Math.pow(3,num.size()-i-1);
            sum = sum + res*num.get(i);
        }
        
        return sum;
    }

    //char에서 -'0'을 하면 int값의 숫자값이 나온다는것 떠올리기.
    //문자열에 정수를 더하면 자동으로 문자열로 변환이되어 이어진다.
    public int solution2(int n) {
        int answer = 0;

        String str = "";

        while(n>0)
        {
            int r = n%3;
            n = n / 3;
            str = r + str;
        }
        System.out.println(str);

        for(int i=0; i<str.length(); i++)
        {
            answer += Math.pow(3,i) * (str.charAt(i) - '0');
        }

        return answer;
    }
}
