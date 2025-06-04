public class 기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            // 약수의 갯수
            int divisor_cnt = divisorCount(i);
            
            if(divisor_cnt > limit){
                answer += power;
            }else{
                answer += divisor_cnt;
            }
            
        }
        
        return answer;
    }
    
    // 약수의 갯수를 구하는 방법으로 O(logN) 시간복잡도를 가진 Math.sqrt(n) : 제곱근 을 사용한 방법.
    public int divisorCount(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else{
            int count =0;
            for(int i=1; i< (int) Math.sqrt(n)+1; i++){
                if(i*i == n){   // n=4 일 경우 i가 2일 때
                    count++;
                }else if(n%i == 0){
                    count+=2;
                }
            }
            return count;
        }
    }
}
