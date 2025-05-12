import java.util.*;
class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // HashMap으로 인물 별 그리움점수를 key-value로 저장.
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int sum =0;
            for(int j=0; j<photo[i].length; j++){
                // photo[] 에 그리움 점수가 없는 사람의 이름이 있을 수 있다, 이 경우를 위해서 getOrDefault()메소드를 사용.
                sum += map.getOrDefault(photo[i][j],0);
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}