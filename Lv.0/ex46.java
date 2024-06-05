//문자열 묶기
import java.util.HashMap;
import java.util.Map;


//안풀리다가 방법을 찾아보고 HashMap()을 사용한 방법을 활용, JavaScript로 key-value 쌍으로 풀었기 때문에 방법은 알았지만 Java에서 사용할 방법을
//몰라서 찾아보았음.
public class ex46 {
    public int solution(String[] strArr) {
        Map<Integer,Integer> answer = new HashMap<>();
        
        for(String str : strArr){
            //초기값이 없으면 get시에 null을 반환하므로 getOrDefault()로 없으면 0으로 초기화를하고, 그다음에 1을 늘려줘야한다. 
            answer.put(str.length(), answer.getOrDefault(str.length(),0)+1);
        }
        
        int max = 0;
        for(int count : answer.values()){
            if(max < count)
                max = count;
        }
        
        return max;
    }
}

//다른 깔끔한 풀이, 문자의 길이가 최대 30이라고 했으므로 이게 더 정석에 가까운풀이였을것.
public int solution(String[] strArr) {
    int answer = 0;

    int[] lengArr = new int[31];

    for(int i=0; i<strArr.length; i++) {
        //해당 문자열의 길이의 idx값을 +1
        lengArr[strArr[i].length()]++;
    }

    for(int i=0; i<=30; i++) {
        answer = Math.max(answer, lengArr[i]);
    }

    return answer;
}