//서울에서 김서방 찾기


public class ex8 {
    public String solution(String[] seoul) {
        String answer = "";
        int idx = -1;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim"))
                idx = i;
        }
        return "김서방은 "+ idx + "에 있다";
    }
}
