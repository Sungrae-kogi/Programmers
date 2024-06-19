//명예의 전당(1)
import java.util.*;

//k가 socre.length보다 큰 경우가 테스트케이스에서 존재하여 런타임 에러를 발생시켜 급히 해결하느라 코드가 엉망, 
//그거를 제외하고는 매번 rank 배열을 정렬하며 score가 rank[0]보다 큰 경우 rank[0]를 갱신시키고, 다시 rank를 정렬하는식으로
//순위를 유지하며 최솟값의 rank값을 추출하는 방식이었다.
public class ex39 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[k];
        for(int i=0; i<k; i++){
            rank[i] = 2001;
        }
        if(k < score.length){
            for(int i=0; i<k; i++){
                rank[i] = score[i];
                Arrays.sort(rank);
                answer[i] = rank[0];
            }
        }else{
            for(int i=0; i<score.length; i++){
                rank[i] = score[i];
                Arrays.sort(rank);
                answer[i] = rank[0];
            }
        }
        if(k < score.length){
            for(int i=k; i<score.length; i++){
                //더 큰값이 오면 rank[0]를 바꿔주고 다시 정렬한뒤 answer[i]에 rank[0]를
                if(score[i] > rank[0]){
                    rank[0] = score[i];
                    Arrays.sort(rank);
                    answer[i] = rank[0];
                }else{
                    //그게아니면 정렬할필요도없이 그냥 rank[0]값을 answer[i]에
                    answer[i] = rank[0];
                }
            }
        }
        return answer;
    }
}


//다른 사람의 유사한 풀이. -> ArrayList를 이용하여 Collections.sort()를 사용하여 정렬을 반복했을 뿐, 방식은 나와 똑같았다.
//k 값이 score.length보다 큰 경우를 처리하기위해 맨 앞에 if문 하나로 처리.
public int[] solution2(int k, int[] score) {
    int[] answer = new int[score.length];
    ArrayList<Integer> list = new ArrayList<>();

    if(k < score.length) {
        for(int i=0; i<k; i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        for(int i=k; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(list.size() - k);
        }
    } else {
        for(int i=0; i<score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(0);
        }
    }

    return answer;
}