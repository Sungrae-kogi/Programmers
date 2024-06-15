//나누어 떨어지는 숫자 배열
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayList의 길이는 ArrayList.size() 함수, int와 String 타입 배열의 정렬은 Arrays.sort()로 정렬가능, String은 Arrays.sort(arr,Collections.reverseOrder())도 가능.
//하지만 int 타입은 원시타입으로 내림차순 정렬은 따로 작업을 해주어야함.ex) 오름차순으로 정렬하고 그거를 역순으로 부른다던지.
public class ex12 {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0)
                answer.add(arr[i]);
        }
            
        if(answer.size()==0)
            answer.add(-1);
        return answer;
    }
}
