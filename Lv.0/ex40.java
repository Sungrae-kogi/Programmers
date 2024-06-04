//수열과 구간 쿼리1
import java.util.Arrays;

public class ex40 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        
        for(int[] a : queries){
            for(int i=a[0]; i<=a[1]; i++){
                answer[i]++;
            }
        }
        
        return answer;
    }
}
