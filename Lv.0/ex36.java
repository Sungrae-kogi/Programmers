//문자열 뒤집기
import java.lang.StringBuffer;

//StringBuffer 클래스의 reverse()를 사용하는방법 아니면 for문으로 역방향 idx를 돌리며 하나씩 문자열에 붙여나가는 방법이있다.
//StringBuffer의 reverse() 는 StringBuffer 객체를 리턴하므로 이것을 다시 String으로 바꾸는 toString() 메소드를 사용해주어야한다.
//for문으로 뒤집을때는 charAt()을 사용하더라.
//자바의 String 객체는 불변이라 두 String을 합쳐서 하나의 String으로 만들때 내부적으로는 새로운 String객체를 만들고
//기존의 String 객체들은 가비지 컬렉터로 소멸을 시키는작업이 발생하며 불필요한 부하가 발생한다.
//따라서 이러한 작업이 많을 경우는 StringBuilder를 사용하는데 StringBuilder는 가변 가능한 문자열 객체를 만들기때문


public class ex36 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String left = my_string.substring(0,s);
        String right = my_string.substring(e+1);
        String str = my_string.substring(s,e+1);
        
        StringBuffer st = new StringBuffer(str);
        str = st.reverse().toString();
        
        return left+str+right;
    }
}
