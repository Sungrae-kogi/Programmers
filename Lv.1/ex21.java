//문자열 다루기 기본

//char 배열의 각 요소들의 데이터 타입을 확인하는 함수, Character.isDigit, Character.isLetter 등을 사용하여
//문자의 유형이 문자인지 숫자인지 공백인지는 확인할 수 있다.
public class ex21 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            char[] arr = s.toCharArray();
            
            for(int i=0; i<arr.length; i++){
                if(Character.isLetter(arr[i]))
                    return false;
            }
            return true;
        }
        
        return false;
    }

    //Integer.parseInt()로 정수 변환이 가능하면 true, 도중에 오류가 발생하면 그거는 숫자 이외의 문자가있으므로 false로 예외처리.
    public boolean solution2(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}
