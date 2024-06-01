//A 강조하기
//a를 A로 바꾸고 나머지를 소문자로 변경했으나 테스트케이스 3 실패, 문제는 a를 A로 바꿨지, A가 등장하면 그거를 lowercase 해버리는데에 있었다.
class Solution {
    public String solution(String myString) {
        String answer = "";
        
        String[] arr = myString.split("");
        for(String a : arr){
            System.out.println(a);
            if(a.equals("a") || a.equals("A")){
                answer += "A";
            }else{
                answer += a.toLowerCase();
            }
        }
        
        return answer;
    }
}