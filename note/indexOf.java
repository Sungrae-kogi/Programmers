import java.util.Arrays;

//String[] 배열에서 특정 문자열의 index값을 찾고자 할때, indexOf를 사용가능한지 의문이었고.
//Stirng[] 배열에서는 지원하지않으며, Arrays.asList로 String[]를 List타입으로 변환한 뒤에 사용하면 가능하다.
public class indexOf {
    public static void main(String[] args){

        String[] str = {"one","two","three"};
        System.out.println(Arrays.asList(str).indexOf("two")); // 1반환
    }
    
}
