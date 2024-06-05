//수열과 구간 쿼리3

//임시 변수를 두어서 값을 바꾸는 방법을 사용.
public class ex45 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] querie : queries){
            int temp = arr[querie[0]];
            arr[querie[0]] = arr[querie[1]];
            arr[querie[1]] = temp;
        }
        
        return arr;
    }
}
