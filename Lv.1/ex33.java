//가장 가까운 같은 글자

//첫 글자는 무조건 -1일수밖에없으니 1부터 for문을 돌리고
//2중 for문으로 본인 바로 앞 글자까지 매번 검사하며 자신과 같은 글자가 나올때 해당 index를 저장한다.
//그후 index가 초기값인지를 구분한뒤 값을 처리하여 담아주면 끝.
public class ex33 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i=1; i<s.length(); i++){
            int before_idx = -1;
            for(int j=0; j<i; j++){
                if(s.charAt(i) == s.charAt(j)){
                    before_idx = j;
                }
            }
            if(before_idx == -1){
                answer[i] = -1;
            }else{
                answer[i] = i-before_idx;
            }
        }
        
        return answer;
    }


    //다른 풀이 제일 마음에드는거.
    //substring으로 자기 자신 이저의 문자열을 잘라다가 indexOf 함수를 이용해 판별을 했다.
    public int[] solution2(String str) {
        int[] result = new int[str.length()];

        for(int i=0;i<str.length();i++){

            String subStr = str.substring(0,i);
            if(subStr.indexOf(str.charAt(i))==-1) {
                result[i] = -1;
            }else {
                result[i] = i-subStr.lastIndexOf(str.charAt(i));
            }
        }
        return result;
    }
}
