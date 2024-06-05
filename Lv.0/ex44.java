//문자열이 몇 번 등장하는지 세기

//문자열의 길이를 측정하고 idx 0부터 찾고자 하는 문자열의 길이가 들어갈 수 있는 모든 case를 탐색.
public class ex44 {
    public int solution(String myString, String pat) {
        int answer = 0;
        int myString_len = myString.length();
        int pat_len = pat.length();
        
        for(int i=0; i<=myString_len-pat_len; i++){
            if(myString.substring(i,i+pat_len).equals(pat))
                answer+=1;
        }
        return answer;
    }
}

//startsWith를 사용한풀이, 탐색 범위는 더 길지만, startsWith를 사용하여 판별해도 가능했다.
public int solution(String myString, String pat) {
    int cnt = 0;
    for(int i=0; i<myString.length(); i++) {
        if(myString.substring(i).startsWith(pat)){
            cnt++;
        }
    }
    return cnt;
}