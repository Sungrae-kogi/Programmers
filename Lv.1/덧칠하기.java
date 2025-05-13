public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        // 벽의 길이 n, 롤러의 길이 m 칠해야 할 벽의 번호 배열 section
        int answer = 0;
        
        int start = 0;
        
        /* 그림을 그려서 풀이 하는게 좋은 경우, 벽의 시작지점은 0이고 if문의 조건이 만족한다면
            칠해야 할 롤러의 시작지점을 section[i]-1로 위치시키고 롤러를 칠한다, 그럼 자동으로 start 지점은 += m
        */
        for(int i=0; i<section.length; i++){
            if(start < section[i]){
                start = section[i]-1;
                start += m;
                answer++;
            }
        }
        
        return answer;
    }
}
