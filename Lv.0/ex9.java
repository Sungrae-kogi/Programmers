import java.util.ArrayList;
import java.util.List;




public class ex9 {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int a : arr){
            if(!flag(delete_list,a)){
                answer.add(a);
            }
        }
        
        return answer;
    }

    public boolean flag(int[] array, int n){
        for(int data : array){
            if(data == n)
                return true;
        }
        return false;
    }

    /* 첫 작성 답안. flag 판별을 함수로 분리해보고싶어서 개선해보았음.
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int a : arr){
            boolean flag = false;
            for(int b : delete_list){
                if(a == b){
                    flag = true;
                    continue;
                }
            }
            if(!flag)
                answer.add(a);
        }
        
        return answer;
    }
    */
}
