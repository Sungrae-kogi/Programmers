//약수의 합

//단순하게 모든 case를 순회하는 방법.
public class ex2 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer+=i;
            }
        }
        
        return answer;
    }
}

//모두 돌 필요없이 n/2까지만 순회하고, n 자신을 더해도 동일하다.
public int solution(int n) {
    int answer = n;
    
    for(int i=1; i<=n/2; i++){
        if(n%i==0)
            answer += i;
    }
    
    return answer;
}