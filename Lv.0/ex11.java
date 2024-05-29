public class ex11 {
    public String solution(String myString) {
        String answer = "";
        String[] arrmystr = myString.split("");
        
        for(String str : arrmystr){
            // str < "l" 이거는 사용불가, 문자열 에 쓰는 비교연산자가 아니다. compareTo는 기준 문자열이 사전상 더 앞이라면 음수를 반환
            if(str.compareTo("l") < 0)
                answer += "l";
            else
                answer += str;
        }
        
        return answer;
    }



    //정규표현식에 감탄
    public String solution2(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
}
