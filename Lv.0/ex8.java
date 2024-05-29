public class ex8 {
    public String solution(String my_string, String alp) {
        //java에서도 toUpperCase(), toLowerCase() 가능
        String answer = my_string.replace(alp,alp.toUpperCase());
        return answer;
    }
}
