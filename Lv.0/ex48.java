//리스트 자르기

import java.util.ArrayList;
import java.util.List;

//Arrays.copyOfRange(배열,시작idx,끝idx) 를 사용하여 할수도있음, Arrays는 import java.util.Arrays
public class ex48 {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        switch(n){
            case 1:
                for(int i=0; i<=slicer[1]; i++){
                    answer.add(num_list[i]);
                }
                return answer;
            case 2:
                for(int i=slicer[0]; i<num_list.length; i++){
                    answer.add(num_list[i]);
                }
                return answer;
            case 3:
                for(int i=slicer[0]; i<=slicer[1]; i++){
                    answer.add(num_list[i]);
                }
                return answer;
            case 4:
                for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                    answer.add(num_list[i]);
                }
                return answer;
        }
        
        return answer;
    }
}
