//폰켓몬
import java.util.HashSet;

//문제 해결 방향을 생각한 뒤 풀이, 결국 최대로 나올 수 있는 결과는 N/2 라는것이기 때문에, 주어진 배열에서 
//중복을 제거한 갯수가 N/2보다 작다면? 고를 수 있는 선택지의 최댓값은 그거라는 거고, N/2보다 크다면? N/2 밖에 못내놓는다.
public class ex42 {
    public int solution(int[] nums) {
        int answer = 0;
        //포켓몬 전체를 넣었을때 Set의 길이가 N/2보다 작으면 그 값을 리턴
        //N/2보다 크면 N/2를 리턴하면 해결될것이다.
        HashSet<Integer> choice = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            choice.add(nums[i]);
        }
        if(choice.size() > nums.length/2){
            return nums.length/2;
        }
        
        return choice.size();
    }
}
