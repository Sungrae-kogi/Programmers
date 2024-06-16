//수박수박수박수박수?

//문자열 반복 case를 생각해서 규칙을파악한 뒤 case를 나눠 해결하였음. n==1 or 2인 경우를 따로 빼주는 작업과
//그 이외의 경우에는 n이 홀수 와 짝수일 때로 나누었을때 같은 형식이 반복된다는 것을 생각해야함. repeat() 함수도 떠올릴 수 있었다.
public class ex16 {
    public String solution(int n) {
        if(n == 1){
            return "수";
        }else if(n == 2){
            return "수박";
        }else{
            if(n%2==0){
                return "수박".repeat(n/2);
            }else{
                return "수박".repeat(n/2)+"수";
            }   
        }
    }
}
