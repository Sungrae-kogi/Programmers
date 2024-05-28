//마지막 두 원소
import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int last = num_list[num_list.length-1];
        for(int i=0; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        
        if(last > num_list[num_list.length-2]){
            answer.add(last-num_list[num_list.length-2]);
        }else{
            answer.add(last*2);
        }
        
        return answer;
    }
}
