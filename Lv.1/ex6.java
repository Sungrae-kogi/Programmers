//정수 제곱근 판별

//Math.sqrt() double 타입의 제곱근 반환, (int) 또는 Math.floor()로 소숫점 제거 가능, Math.pow(a,b)-> a^2 제곱 반환
public class ex6 {
    public long solution(long n) {
        long answer = 0;
        
        double sqrt = Math.sqrt(n);
        
        if(sqrt == (int)sqrt)
            return (long) Math.pow((int)sqrt+1,2);
        
        return -1;
    }
}
