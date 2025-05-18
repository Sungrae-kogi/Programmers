public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            int count = 0;
            
            // 앞 문자부터 꺼내서 count=index가 될때 까지 skip을 피해서 이동한 후 answer에 더함.
            char ch = s.charAt(i);
            while(count < index){
                // count가 안채워져서 들어왔다 -> 이동해야함.
                if(ch == 'z'){
                    ch = 'a';
                }else{
                    ch += 1;
                }
                
                // 문자가 skip에 포함되어 있지 않다면 맞게 이동했으므로, count를 늘림.
                if(!skip.contains(String.valueOf(ch))){
                    count++;
                }
                // 만약 skip에 포함되어있는 문자라면 그냥 다음 루프로 넘어가면됨.
            }
            answer += ch;
        }
        return answer;
    }
}
