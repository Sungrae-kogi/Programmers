import java.util.Arrays;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int[] desc_score = new int[score.length];
        for(int i=0; i<score.length; i++){
            desc_score[i] = score[score.length-i-1];
        }
        
        for(int i=m-1; i<score.length; i+=m){
            int cal = desc_score[i] * m;
            answer += cal;
        }
        return answer;
    }
}
