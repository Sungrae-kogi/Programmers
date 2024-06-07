//문자열 내 p와 y의 개수

//String과 char 타입의 비교과정에서 애를먹은 문제, 
//우선 == 연산자는 객체의 주소를 비교하여 동일주소를 참조하여 일치하는지를 비교하고, equals()는 객체의 내용을 비교하여 같은지 확인하는 메소드
//따라서 String str1 = "123", String str2 = "123" 이렇게 리터럴로 선언한다면 String constant pool 영역에서는 같은 값의 문자열을 공유하며
//메모리 사용량을 최적화 하려고 하기때문에 str1 == str2 를 한다면 true 가 나오는것, 이렇게 직접 선언하는것이 아닌
//new String("123") 으로 새로운 문자열 객체를 생성한다면 Heap 영역에 저장되며 str1과 str2는 다른 메모리주소값을 받게된다.
//이때는 ==을 사용해도 false 값을 얻으며 내용만을 비교하고자 equals()를 사용한다면 true가 리턴

//그리고 이 문제에서 charAt() 으로 문자열 index의 값을 char 타입으로 리턴받았을때 그것을 문자와 비교하려면 같은 char 타입인
//'' 작은 따옴표로 Y와 P를 묶어서 == 으로 참 거짓을 판별해야 한다.
public class ex1 {
    boolean solution(String s) {
        boolean answer = true;
        s= s.toUpperCase();
        
        int p_count = 0;
        int y_count = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'Y')
                y_count++;
            else if(s.charAt(i) == 'P')
                p_count++;
        }
        if(p_count == y_count)
            return true;
        
        return false;
    }
}
