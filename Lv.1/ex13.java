//핸드폰 번호 가리기

//길이 파악과 repeat(n)함수 사용을 떠올렸고. String.substring(start,end) 를 사용한 문자열 슬라이싱
public class ex13 {
    public String solution(String phone_number) {
        String answer = "";
        
        answer += "*".repeat(phone_number.length()-4);
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }
}
