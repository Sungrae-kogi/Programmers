//문자열 내림차순으로 배치하기
import java.util.Arrays;


//정렬 후 역순으로 for문
public class ex19 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            answer += arr[i];
        }
        return answer;
    }
}

//다른 풀이중, 기업 입장에서는 Stream 라이브러리로 한두줄 로 낸 결과보다는 이것을 더 선호할것이다 란 말에 끌려
//가져와 본 풀이, 문자열을 하나하나로 나누는데 toCharArray()로 char배열로 만들었고 애초에 대문자와 소문자를 따로 분리하여
//정렬한뒤에 나중에 이어붙여도 결과는 동일하다는 점을 생각한거같다.
class ReverseStr {
    public String reverseStr(String str){
    char[] ch = str.toCharArray();
        String lower = "";
        String upper = "";

        for(int i = 0; i < ch.length; i++) {
            int chnum = ch[i];

            if(chnum >= 65 && chnum <= 90)
                upper += ch[i];
            else
                lower += ch[i];
        }

        char[] chUpper = upper.toCharArray();
        char[] chLower = lower.toCharArray();
        upper = ""; lower = "";

        Arrays.sort(chUpper);
        Arrays.sort(chLower);

        for(int i = chUpper.length - 1; i >= 0; i--)
            upper += chUpper[i];
        for(int i = chLower.length - 1; i >= 0; i--)
            lower += chLower[i];

        return lower + upper;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}