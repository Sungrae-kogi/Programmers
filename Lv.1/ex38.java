//콜라 문제

//while문 탈출조건 설정 및 변수 값 변동 상황 추적 핵심.
public class ex38 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            if(n < a)
                break;
            
            answer += (n/a)*b;
            n = (n/a)*b + n%a;
        }
        return answer;
    }
}
