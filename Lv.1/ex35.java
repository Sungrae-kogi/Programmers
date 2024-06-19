//K번째수
import java.util.Arrays;

//큰 문제는 없으나 Java 에서 배열을 다루는데에 익숙하지 못하기에 난잡하게 풀어서 해결한것같다, 정수배열의 정렬을 위해
//Arrays.sort()를 떠올려 사용.
public class ex35 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            //이부분
            int[] arr = new int[commands[i][1]-commands[i][0]+1];
            int idx =0;
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                arr[idx++]=array[j];
            }

            //int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); 로 대체가 가능하다
            
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}
