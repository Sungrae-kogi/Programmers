//길이에 다른 연산
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int list_length = num_list.length;
        if(list_length >= 11){
            
            for(int i=0; i<list_length; i++){
                answer += num_list[i];
            }
            return answer;
        }else{
            answer++;
            for(int i=0; i<list_length; i++){
                answer *= num_list[i];
            }
            return answer;
        }
    }
}

//다른 사람의 풀이, 변수 설정에 깔끔한 부분이 있었고, 불필요한 for문의 사용을 하나로 줄여 감탄했다.
class Solution2 {
    public int solution(int[] num_list) {
        //배열 곱을 구할때는 시작값이 1이어야하고 배열합을 구할때는 0이어야 하는점을 삼항 연산자를 이용하여 깔끔하게 정리.
        int answer = (num_list.length < 11 ? 1 : 0);

        for(int i=0; i<num_list.length; i++){

            if(num_list.length < 11) {
                answer *= num_list[i];
            }else{
                answer += num_list[i];
            }

        }

        return answer;
    }
}