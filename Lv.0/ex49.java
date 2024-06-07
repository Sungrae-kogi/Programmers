//수열과 구간 쿼리4

//
public class ex49 {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] querie : queries){
            for(int i=querie[0]; i<=querie[1]; i++){
                if(i%querie[2]==0)
                    arr[i]++;
            }
        }
        
        return arr;
    }
}
