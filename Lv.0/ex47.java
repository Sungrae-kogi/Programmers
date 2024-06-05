//2의 영역
import java.util.ArrayList;
import java.util.List;


//for 남발로 너무 더럽게풀었다고 생각한다, 2의 시작점과, 끝점을 판별하고, 그 사이의 값들을 받아 리턴하되, 2가 없는경우 [-1]을 리턴해야한다.
public class ex47 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==2){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            answer.add(-1);
            return answer;
        }
        int last_idx = -1;
        for(int i=idx; i<arr.length; i++){
            if(arr[i] == 2){
                last_idx = i;
            }
        }
        
        for(int i=idx; i<=last_idx; i++){
            answer.add(arr[i]);
        }
        
        return answer;
    }
}

//다른풀이의 숏코딩을 제외한 좋아요 1위 역시 for문을 3번사용, 2가없는경우의 예외처리까지 유사한거로보아 이 풀이가 맞기는 한가보다.
//시작지점과, 끝지점을 for 한번으로 탐색하는 방법을 찾아냈다, 나는 두번의 for를 돌렸지만, for 하나로 시작점이 초기값인지를 판단해서 끝지점만
//따로 업데이트를 해주는식으로 가능했다.
        int start = -1;
        int end = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                if(start==-1){
                    start = i;
                }
                end = i;
            }
        }