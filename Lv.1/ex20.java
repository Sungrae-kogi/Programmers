//부족한 금액 계산하기

//금액이 부족하지 않을 경우 0을 리턴한다는 부분에 대한 처리가 중요
public class ex20 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i=1; i<=count; i++){
            answer += price*i;
        }
        
        
        return money > answer? 0: answer-money;
    }
}
