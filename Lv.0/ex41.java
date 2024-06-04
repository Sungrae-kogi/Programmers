//배열의 길이를 2의 거듭제곱으로 만들기
import java.util.ArrayList;
import java.util.List;

public class ex41 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            answer.add(arr[i]);
        }
        int len = arr.length;
        int po = 1;
        while(po < len){
            po *=2;
        }
        if(po == len)
            return answer;
        for(int i=0; i<po-len; i++){
            answer.add(0);
        }
        
        return answer;
    }
}
