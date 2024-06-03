//문자 리스트를 문자열로 만들기
public class ex29 {
    public String solution(String[] arr) {
        
        return String.join("",arr);
    }
}

//String.join()은 합친 문자열을 반환, 첫 번째 인자로 배열의 원소를 연결할 구분 문자, 두 번째 인자로 배열을 넣습니다.