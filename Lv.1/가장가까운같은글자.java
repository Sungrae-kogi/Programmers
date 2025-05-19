public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        // 2개의 인덱스를 사용
        for(int i=1; i<s.length(); i++){
            char now = s.charAt(i);
            
            int count = -1;
            for(int j=0; j<i; j++){
                if(s.charAt(j) == now){
                    count = j;
                }
            }
            
            // 가장 가까운 index가 들어가있을것.
            if(count != -1){
                answer[i] = i-count;
            }else{
                answer[i] = count;
            }
        }
        return answer;
    }
}

// 좋은 풀이, String.lastIndexOf(Char)를 사용하면 바로얻을수있다.

// public int[] solution(String str) {
//     int[] result = new int[str.length()];

//     for(int i=0;i<str.length();i++){

//         String subStr = str.substring(0,i);
//         if(subStr.indexOf(str.charAt(i))==-1) {
//             result[i] = -1;
//         }else {
//             result[i] = i-subStr.lastIndexOf(str.charAt(i));
//         }
//     }
//     return result;
// }