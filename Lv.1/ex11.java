//콜라츠 추측

//int answer =0; 이고 함수 반환형도 int 타입이었는데, 테스트 케이스 진행 도중 오버플로우가 발생하면서 값이 변하기때문에 이거를 long타입으로 바꿔줬다고한다.
//이런거는 좀 풀이하는 입장에서 생각하기 힘들다고 생각한다.
public class ex11 {
    public long solution(int num) {
        long answer = 0;
        while(num != 1){
            if(num%2==0){
                num /=2;
            }else if(num%2==1){
                num = num*3 +1;
            }
            answer++;
            if(answer >=500){
                return -1;
            }
        }
        return answer;
    }
}
