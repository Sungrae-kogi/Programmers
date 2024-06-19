//두 개 뽑아서 더하기

import java.util.Set;
import java.util.TreeSet;

//더한 결과의 중복을 허용하지 않는것을 보고 Set 자료구조를 떠올릴 수 있으면 좋다.
//java에서는 set을 HashSet, TreeSet 등 여러 클래스로 지원하는데, 여기서는 정렬을 요구하므로 자동으로 오름차순으로 정렬해주는 TreeSet을 사용
public class ex34 {
    public Set<Integer> solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                answer.add(numbers[i]+numbers[j]);
            }
        }
        
        return answer;
    }
}
