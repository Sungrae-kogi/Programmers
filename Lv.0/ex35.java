//글자 지우기

//특정 idx들의 글자들을 지운다음에 하나로 합쳐서 리턴시켜야한다.
//무작정 지운다면 인덱스값이 계속 변하게 되면서 문제가 발생하므로 문자 하나씩 분리한다음에 해당 idx 값을 ""으로 바꾸고 그 후에 합쳐서 리턴.
public class ex35 {
    public String solution(String my_string, int[] indices) {
        String[] answer = my_string.split("");
        for(int i=0; i<indices.length; i++){
            answer[indices[i]] = "";
        }
        
        
        return String.join("",answer);
    }
}
