//특정 문자열로 끝나는 가장 긴 부분문자열
//lastIndexOf()는 인자로 전달받은 문자열이나 문자가 뒤에서부터 가장 먼저 나오는 index를 반환, 없으면 -1
//indexOf()는 앞에서부터 먼저나오는 index를 반환, 없으면 -1
public class ex39 {
    public String solution(String myString, String pat) {
        String answer = "";
        int last_idx = myString.lastIndexOf(pat);
        
        return myString.substring(0,last_idx) + pat;
    }
}
