import java.util.*;
public class 명예의전당1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[k];
        
        // 가능한 점수의 범위가 2000까지이므로
        for(int i=0; i<k; i++){
            rank[i] = 2001;
        }
        
        for(int i=0; i<score.length; i++){
            if(i < k){
                rank[i] = score[i];
            }else{
                if(rank[0] < score[i]){
                    rank[0] = score[i];
                    
                }
            }
            Arrays.sort(rank);
            answer[i] = rank[0];
        }
        return answer;
    }
}

/*
 * Arrays.sort()에서 Wrapper 클래스를 사용하면 
 * 내림차순 또는 사용자지정 정렬이 가능함.
 * 
 * 오름차순 : Arrays.sort(Arr, (a,b) -> a-b);
 * 내림차순 : Arrays.sort(Arr, (a,b) -> b-a);
 * 
 * 또한 Comparator를 사용한 방법도 있음
 * Arrays.sort(Arr, Comparator.reverseOrder()); // 내림차순
 */