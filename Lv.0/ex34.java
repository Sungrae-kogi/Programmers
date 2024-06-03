//빈 배열에 추가, 삭제하기
import java.util.ArrayList;
import java.util.List;

//가변배열을 이용하여 값을 추가하고 삭제하는작업들을 반복, ArrayList컬렉션을 사용, remove()함수는 인자로 삭제할 요소의 idx값을 받는다.
public class ex34 {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    answer.add(arr[i]);
                }
            }else{
                for(int j=0; j<arr[i]; j++){
                    answer.remove(answer.size()-1);
                }
                
            }
        }
        
        return answer;
    }
}
