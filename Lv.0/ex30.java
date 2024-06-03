//세로 읽기

//문자열을 m간격으로 잘라 세로로 이었을때 c번째 세로줄의 글자를 읽어라.
//자를 필요없이 간격이 동일하므로 c번째글자부터 시작해서 +=m 간격으로 my_string의 길이를 넘기전까지 뽑아냈다.
public class ex30 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i=0; i<my_string.length(); i+=m){
            answer += my_string.charAt(i+c-1);
        }
        
        
        return answer;
    }
}
