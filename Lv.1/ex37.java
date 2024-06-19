//문자열 내 마음대로 정렬하기
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//못풀겠어서 힌트만 얻고 코드는 보지않은채 풀었다.
//정렬 기준으로 삼고자 하는 n번째 글자를 문자열의 맨 앞에 붙인다음 정렬하면 하고자 하는 정렬 기준과 일치한다는것.
//String에 char를 더하여 이어붙일 수 있다는것과, 추후에 붙였던 문자를 제거할때 String.substring()으로 제거한 문자열을 리턴했다.
public class ex37 {
    public List<String> solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++){
            strings[i] = strings[i].charAt(n) + strings[i]; 
            //answer.add(strings[i].charAt(n) + strings[i]);
        }
        Arrays.sort(strings);
        
        for(int i=0; i<strings.length; i++){
            answer.add(strings[i].substring(1));
        }
        
        
        return answer;
    }
}


//** 학습해야 할 방법 -> 정렬기준 오버라이드
//Collections.sort()뿐만 아니라 Arrays.sort()에서도 comparator를 인자로 전달할 수 있다.

public String[] solution3(String[] strings, int n) {
    Arrays.sort(strings, new Comparator<String>(){
        @Override
        public int compare(String s1, String s2){
            if(s1.charAt(n) > s2.charAt(n)) return 1;
            //n번 index값이 같으면 그냥 사전순으로 비교해야하니까 s1.compareTo(s2)를 리턴
            else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
            else if(s1.charAt(n) < s2.charAt(n)) return -1;
            else return 0;
        }
    });
    return strings;
}



//테스트는 맞지만 제출시 싹 틀린코드, comparator에 대해 조사해보고 사용했다.
public List<String> solution2(String[] strings, int n) {
    List<String> answer = new ArrayList<>();
    
    for(String str : strings){
        answer.add(str);
    }        
    
    Collections.sort(answer, new Comparator<String>(){
       public int compare(String a, String b){
           if(a.charAt(1) > b.charAt(1))
               return 1;
           else if(a.charAt(1) < b.charAt(1))
               return -1;
           else if(a.charAt(1) == b.charAt(1))
               return -1;
           else
               return 0;
       } 
    });
    
    return answer;
}