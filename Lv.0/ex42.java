//1로 만들기

public class ex42 {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            while(num_list[i] != 1){
                if(num_list[i] %2 ==0){
                    num_list[i] /= 2;
                    answer++;
                }else if(num_list[i] %2 ==1){
                    num_list[i]--;
                    num_list[i] /=2;
                    answer++;
                }
                    
            }
        }
        return answer;
    }
}