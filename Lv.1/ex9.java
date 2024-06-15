//음양 더하기

//음수를 만드는 방법은 절대값에서 -1을 곱하는것.
public class ex9 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i])
                answer += absolutes[i];
            else
                answer += (-1*absolutes[i]);
        }
        return answer;
    }
}
