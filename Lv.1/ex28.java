//예산
import java.util.Arrays;


// 정수 배열을 Arrays.sort()로 오름차순으로 정렬하고 순서대로 더한 값이 정해진 예산 안에서 가장 많은 물건을 사는 경우의 수와 동일하다
public class ex28 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            sum = sum + d[i];
            if(sum > budget)
                break;
            //늘리기 전에, 그 더했던값으로 인해 예산초과가 된다면? 더한상품은 무효가되야함
            answer++;
        }
        
        return answer;
    }
}
