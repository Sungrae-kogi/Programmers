//등차수열의 특정한 항만 더하기
public class ex31 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0; i<included.length; i++){
            if(included[i])
                answer += a + (d*i);
        }
        
        return answer;
    }
}
