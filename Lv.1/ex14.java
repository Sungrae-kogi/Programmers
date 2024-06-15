//제일 작은 수 제거하기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//자바에서는 단순하게 함수하나로 배열에서 min 값을 얻어내는방법이 없다 따라서 몇가지 방법을 거쳤는데 오름차순 정렬 후 idx = 0값을 min값으로 하여
//그 값을 제외한 값들을 배열에 받아 리턴시켰다.
public class ex14 {
    public List<Integer> solution(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != copy[0])
                answer.add(arr[i]);
        }
        if(answer.size() ==0)
            answer.add(-1);
        
        return answer;
    }
}


// 타인의 풀이에서 실패했던 방법에 대한 해결법을 찾음.
//처음에 애초에 arr의 길이가 1이면 자기자신이 min값이며 그게 제거되어 [-1]을 리턴시켜야하는데 return [-1]을 하면 오류가 발생해서
//다른 방법을 찾았었다, 하지만 return new int[]{-1}; 을 하면 되는거였다.
public int[] solution(int[] arr) {
    if (arr.length <= 1) return new int[]{ -1 };
    int min = Arrays.stream(arr).min().getAsInt();
    return Arrays.stream(arr).filter(i -> i != min).toArray();
}