public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;        
        while (!s.equals("")) {
            answer++;
            s = splitResult(s);
        }
        return answer;
    }

    private String splitResult(String s) {
        char x = s.charAt(0);
        int sameCnt = 0;
        int diffCnt = 0;
        int i = 0;
        do {
            if (x == s.charAt(i)) {
                sameCnt++;
            } else {
                diffCnt++;
            }
            i++;
        } while (s.length() > i && sameCnt != diffCnt);

        return s.substring(i);
    }
}