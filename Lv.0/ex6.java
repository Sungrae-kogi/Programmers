import java.util.ArrayList;
import java.util.List;

public class ex6 {
    public List<String> solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> filtered_answer = new ArrayList<>();
        
        for(String a : answer){
            if(a.equals("")){
                
            }else{
                filtered_answer.add(a);
            }
        }
        
        return filtered_answer;
    }
}
