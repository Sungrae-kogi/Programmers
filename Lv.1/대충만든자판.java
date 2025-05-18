import java.util.*;

public class 대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // String에서 indexOf()는 제일 먼저 찾은 index를 반환한다는 점 + 없다면 -1을 리턴한다는 점을 이용한 풀이. 
        // 그러나 3중 for문이므로 문제 조건이 달랐다면 시간초과, 따라서 HashMap과 HashMap의 containsKey()를 사용한 방법을 추천.

        //String 에서 indexOf() 하면 제일 앞쪽이 나옴, 없다면 -1
        for(int i=0; i<targets.length; i++){
            int sum = 0;
            //targets[i]의 글자 하나씩
            for(int j=0; j<targets[i].length(); j++){
                String c = ""+targets[i].charAt(j);
                
                int min = 102;
                //키맵 별로 indexOf()값 비교해서 최저값을 저장, 단 결과가 -1이면 작성할 수 없는때.
                for(int k=0; k<keymap.length; k++){
                    int idx = keymap[k].indexOf(c);
                    if(idx != -1){
                        min = Math.min(min, idx+1);    
                    }else{
                        //keymap 문자열 중 c가 없으면 다음 루프로 넘김.
                        continue;
                    }
                }
                
                // 계속 indexOf()가 -1이 나오면 min은 102 그대로일것.
                if(min != 102){
                    answer[i] += min;
                }else{
                    // 102라면 작성불가능이므로 -1로 하고 루프 자체를 종료시켜야**
                    answer[i] = -1;
                    break;
                }
            }
            
            
        }
        
        return answer;
    }
}


// 더 좋을거라 생각하는 방법


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int j = 0; j < key.length(); j++) {

                char ch = key.charAt(j);

                if (map.containsKey(ch)){
                    if(map.get(ch)>j){
                        map.replace(ch,j+1);
                    }
                }else{
                    map.put(ch,j+1);
                }
            }
        }

        for(int i=0; i< targets.length;i++){
            int sum = 0;
            for(int j=0; j<targets[i].length();j++){

                char ch = targets[i].charAt(j);

                if(map.containsKey(ch)){
                    sum+=map.get(ch);
                }else{
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}