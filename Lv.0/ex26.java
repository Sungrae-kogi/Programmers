//9로 나눈 나머지
public class ex26 {
    public int solution(String number) {
        String[] answer = number.split("");
        int sum = 0;
        for(String a : answer){
            sum += Integer.parseInt(a);
        }
        return sum%9;
    }
}

//charAt() 과 -'0' 을 이용한 방법이 신기해서 가져와봄
// - '0'은 문자열을 숫자로 변환하는 방법으로 문자 '5'가 있을때 문자 '0'의 아스키 값을 빼면 정수 5가 된다.
class Solution {
    public int solution(String number) {
        int answer = 0;

        for(int i=0; i<number.length(); i++) {
            answer += number.charAt(i) - '0';
        }

        answer %= 9;

        return answer;
    }
}