//날짜 비교하기
//for로 순회하면서, 날짜가 더 작으면 1을 크면 0을, 같으면 알아서 i값이 늘어나며 월을 비교하고 일을 비교하면서 낮을경우 리턴하도록.
//만약 전부 다 같아서 for를 빠져나오면 아예 동일 날짜이므로 기존 answer값인 0을 리턴할것. 
public class ex33 {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i=0; i<3; i++){
            if(date1[i] < date2[i]){
                return 1;
            }else if(date1[i] > date2[i]){
                return 0;
            }
        }
        return answer;
    }
}
