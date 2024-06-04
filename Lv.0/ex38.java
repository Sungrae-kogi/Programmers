//문자열 섞기

//두 문자열의 길이가 동일하기때문에 단일 for문, Java에서는 String과 char을 +로 이어붙이기 가능.
public class ex38 {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i=0; i<str1.length(); i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}
