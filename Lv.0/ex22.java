//특별한 이차원 배열 1

public class ex22 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j)
                    answer[i][j]=1;
                else
                    answer[i][j]=0;
            }
        }
        
        
        return answer;
    }
}

//다른 사람의 풀이에서 느낀바가있음
//for문을 하나만 돌린 이유가 int 배열을 선언하면 자동으로 할당하지않은 부분이 0으로 채워진다고 함,
//하지만, Integer로 선언하면 0이 아닌 null값으로 채워지는 차이점이 있고 이것은 int는 원시타입이고 Integer는 레퍼런스타입이기때문 int형 배열은
//자동으로 0을 fill하는게 아니라 배열 생성시 기본값이 0인것이다.
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
