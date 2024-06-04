//배열 만드르기5

import java.util.ArrayList;
import java.util.List;

public class ex37 {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(String str : intStrs){
            if(Integer.parseInt(str.substring(s,s+l)) > k)
                answer.add(Integer.parseInt(str.substring(s,s+l)));
        }
        
        return answer;
    }
}
