public class ex13 {
    // 1. 문자열을 자르는 메소드 split()
    // 문자열 String 을 특정 문자로 자를때 사용할 수 있는 메소드가 split() 이다.

    // 공백으로 문자열을 자를때, split(" ") 으로 자르면 되지만, 문자열이 끝나고 마지막에 붙는 공백은 얻어지지 않는다.
    // 파라미터로 -1을 추가하는 것의 큰 차이는 문자열이 공백으로 끝날때의 공백을 취득하냐 여부이다.

    // 마지막 공백갯수도 취득해야할 때는 split() 메소드에 파라미터로 -1을 주면 된다.

    // String[] split(String regex, int limit) -> limit은 배열의 크기를 결정
    // ex) 81-1-2323.split("-",2) 하면 81, 1-2323으로 나누어짐
    public int[] solution(String myString) {
        String[] split_str = myString.split("x", -1);
        int[] answer = new int[split_str.length];

        for (int i = 0; i < split_str.length; i++) {
            answer[i] = split_str[i].length();
        }
        return answer;
    }

}

//분리 기준문자가 문자열의 맨 마지막에 있냐 여부가 중요. 이런느낌으로 분리하는경우도 있음.
if(myString[myString.length-1] == "x"){
    //마지막에 공백하나를 추가해야한다.
}