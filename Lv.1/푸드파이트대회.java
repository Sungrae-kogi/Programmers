public class 푸드파이트대회 {
    public String solution(int[] food) {
        String answer = "";
        // 0을 기준으로 좌측의 순서를 정함
        for(int i=1; i<food.length; i++){
            if(food[i] != 1){   //음식이 딱 1개만온 경우만 쓸수가없다, 그 이상의 숫자는 최소 한 쌍이라도 사용하고 버림
                for(int j=0; j<food[i]/2; j++){
                    String a = ""+i;
                    answer += a;
                }
                // answer += (""+i).repeat(food[i]/2); 로 축약도 가능하다.
            }
        }
        
        // 정해진 좌측의 순서를 뒤집은 문자열을 생성.
        String answer_right = "";
        for(int i=0; i<answer.length(); i++){
            answer_right += answer.charAt(answer.length()-i-1);
        }
        
        return answer+"0"+answer_right;
    }
}
