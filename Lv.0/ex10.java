import java.util.ArrayList;
import java.util.List;

public class ex10 {
    public List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            if(i%2==0)
                answer.add(strArr[i].toLowerCase());
            else
                answer.add(strArr[i].toUpperCase());
        }
        
        
        return answer;
    }
}
