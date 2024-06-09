//자연수 뒤집어 배열로 만들기

//함수들을 많이 찾아봐서 직접 푼건아니다.

//long 타입을 String으로 변환시키기 위해 String.valueOf()를 사용, Object 값을 String으로 바꾼다는 점은 toString()도 있지만 
//차이점이 있다, 변경하고자 하는 Object가 null인 경우 toString() 은 nullPointerException을 리턴하고, valueOf()는 "null"을 리턴한다.
//때문에 valueOf는 null체크시 "null".eqauls(string) 형태로 체크를 해야한다.
public class ex4 {
    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        
        int[] answer = new int[str.length];
        
        for(int i=0; i<str.length; i++){
            answer[i] = Integer.parseInt(str[str.length-1-i]);
        }
        
        return answer;
    }
}

//다른 풀이
String str = "" + n; //이렇게 공백을 더해서 문자열로 바꿔주는게 가능했다, 이렇게하면 내부적으로 StringBuffer가생성된다고한다.