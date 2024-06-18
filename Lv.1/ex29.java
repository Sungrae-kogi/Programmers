//이상한 문자 만들기

//문자열을 분리한 뒤 전체를 돌며, 공백이 나왔을 경우 idx값을 1로 만들어 그 다음에 문자의 첫 알파벳이 왔을때 짝수번째 index로 판별되게끔.
//.split("")으로 String 배열로 분리하여 arr[i].toUpperCase()를 바로 사용가능했지만,
//만일 String 타입을 index별로 charAt()을 사용하여 순회한다면 Character.toUpperCase()를 사용해야 한다.
public class ex29 {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        
        int idx =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(" ")){
                idx=1;
            }
            if(idx%2==0)
                answer += arr[i].toUpperCase();
            else
                answer += arr[i].toLowerCase();
            idx++;
            
        }
        
        return answer;
    }
}
