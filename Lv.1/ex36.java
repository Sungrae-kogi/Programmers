//푸드 파이트 대회

//그냥 문자열 조작 문제이지않을까?, 음식의 갯수가 1일때만이 규칙이 다르고 나머지는 모두 num/2의 갯수만큼 양측 배분을 하면되기때문에
//그것에 대한 분기처리만 해주면 해결된다고 생각한다,
public class ex36 {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            if(food[i]==1)
                continue;
            answer += (""+i).repeat(food[i]/2);
        }
        String right = "";
        for(int i=answer.length()-1; i>=0; i--){
            right += answer.charAt(i);
        }
        return answer + "0" + right;
    }
}

//다른풀이인데 깔끔해서 가져옴
public String solution2(int[] food) {
    String answer = "0";

    //가운데의 0에서부터 좌우로 붙여나가는거기때문에 i가 food.length-1부터 0까지 줄여나간다.
    for (int i = food.length - 1; i > 0; i--) {
        for (int j = 0; j < food[i] / 2; j++) {
            answer = i + answer + i; 
        }
    }

    return answer;
}