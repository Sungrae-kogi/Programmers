//기사단원의 무기

//약수의 갯수를 찾는 알고리즘중 효율적인 방법을 알고있어야 한다,
//가장 기본저긴 방법은 1부터 n까지를 돌리며 n%i ==0 인 case를 세는 것이며.
//이번에 학습한 효율적인 방법은, n%i==0 이라면 i는 자기 자신과 n/i 모두 약수이므로 동시에 2개의 약수가 찾아진다는것.
//따라서 이게 어디까지 반복되는가?? -> i*i =n인 경우까지 따라서 i*i<=n 까지만 탐색하면 불필요한 경우를 제외할 수 있으므로 효율성이 올라간다는것.
public class ex44 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1; i<=number; i++){
            int attack = 0;
            //j가 약수라면 i/j도 약수이므로 동시에 2개씩 약수가 찾아지는것, 결국 j*j=i일때까지만 찾으면 불필요한 케이스를 줄이는것.
            for(int j=1; j*j<=i; j++){
                if(j*j ==i)
                    attack++;
                else if(i%j==0)
                    attack+=2;
            }
            if(attack > limit){
                attack = power;
            }
            answer += attack;
        }
        
        return answer;
    }
}
