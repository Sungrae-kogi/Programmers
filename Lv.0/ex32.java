//문자열 잘라서 정렬하기
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//문자 기준으로 잘랐을때 공백이 포함되는 경우 그거를 제외하는작업이 필요하다.
public class ex32 {
    public List<String> solution(String myString) {
        String[] answer = myString.split("x");
        
        List<String> arr = new ArrayList<>();
        for(String a : answer){
            if(!a.equals(""))
                arr.add(a);
        }
        
       Collections.sort(arr);
        
        return arr;
    }
}
