//같은 숫자는 싫어

import java.util.ArrayList;
import java.util.List;

//연속되는 숫자는 하나만 들어가게 하는것이 핵심이고, 이것을 이전숫자를 기억하는방식으로 해결
public class ex25 {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        int before = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != before){
                answer.add(arr[i]);
                before=arr[i];
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
