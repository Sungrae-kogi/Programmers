//가운데 글자 가져오기

//배열로 분해를 안하고 가져올 수도 있었을거같다.
public class ex15 {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        int len = arr.length;
        if(len %2==0){
            answer = answer + arr[len/2-1] +arr[len/2]; 
        }else{
            answer = answer + arr[len/2];
        }
        
        return answer;
    }
}


//배열로 분해를 안하고 될거같아서 해본 결과, String 에 char를 더하는게 가능하기때문에 charAt()으로 idx 값을 가져왔다.
//but 이방식이 실행 효율이 더 안좋다고 나옴.
public String solution(String s) {
    String answer = "";
    
    if(s.length()%2==0){
        answer = answer + s.charAt(s.length()/2-1) + s.charAt(s.length()/2); 
    }else{
        answer = answer + s.charAt(s.length()/2);
    }
    
    return answer;
}