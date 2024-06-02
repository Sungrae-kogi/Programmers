import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex25 {
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        
        for(int i=my_string.length()-1; i>=0; i--){
            answer.add(my_string.substring(i));
        }
       Collections.sort(answer);
        
        return answer;
    }
}
//arrayList<>를 Arrays.sort()로 정렬하려고 했지만 불가능했다, 이유는 Arrays.sort()메소드는 배열을 정렬하는데 사용되며 
//ArrayList<String>은 배열이 아닌 컬렉션으로 Collections.sort()로 정렬을 해야한다.