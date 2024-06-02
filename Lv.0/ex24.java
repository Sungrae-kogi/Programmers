//배열 만들기3
import java.util.ArrayList;
import java.util.List;

public class ex24 {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                answer.add(arr[j]);
            }
        }
        
        return answer;
    }
}
//intervals의 배열값을 start, end로 arr의 값들을 뽑아서 이어붙여 새로운 answer 배열을 만드는것으로
//이중 for로 j를 start와 end값을 받아와 순회하면서 배열에 add했다.