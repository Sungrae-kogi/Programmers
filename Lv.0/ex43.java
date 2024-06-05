//세 개의 구분자
import java.util.ArrayList;
import java.util.List;
//세 개의 구분자 모두 구분해서 분리해야하므로 어차피 동일문자취급해도 상관없으니 b와 c를 a로 바꾸고 진행.
public class ex43 {
    public List<String> solution(String myStr) {
        myStr = myStr.replaceAll("b","a");
        myStr = myStr.replaceAll("c","a");
        String[] answer = myStr.split("a");
        
        List<String> ans = new ArrayList<>();
        
        if(answer.length ==0){
            ans.add("EMPTY");
            return ans;
        }
        
        for(String a : answer){
            if(a.length() != 0)
                ans.add(a);
        }
        
        return ans;
    }
}
