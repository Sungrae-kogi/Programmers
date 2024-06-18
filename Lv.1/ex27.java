//크기가 작은 부분 문자열

//문제의 조건을 따져 overflow 또는 에러가 발생하는 경우를 생각해야하나?
public class ex27 {
    public int solution(String t, String p) {
        int answer = 0;
        
        int p_len = p.length();
        for(int i=0; i<=t.length()-p_len; i++){
            //p의 길이가 18까지이므로 Integer로 바꾸면 overflow
            if(Long.parseLong(t.substring(i,i+p_len)) <= Long.parseLong(p))
                answer++;
        }
        
        return answer;
    }
}
