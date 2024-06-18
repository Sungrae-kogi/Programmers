//최대공약수와 최소공배수

//유클리드 알고리즘이 있지만 최대공약수는 for문으로 두 수중 min값을 기준으로 판별하고
//최소공배수는 두 수의 곱에서 최대공약수를 나눈것과 동일하기때문에 자동으로 판별된다.
public class ex24 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        int maxdiv = 1;
        for(int i=1; i<=min; i++){
            if(n%i==0 && m%i==0)
                maxdiv = i;
        }
        
        
        answer[0] = maxdiv;
        answer[1] = n*m/maxdiv;
        
        return answer;
    }
}
