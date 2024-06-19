//시저 암호

//아스키코드 값을 이용하는 과정에서 미리 알파벳정도는 아스키코드 값을 알필요가 있을것같다.
// A = 65, a = 97 두개만 기억하자 나머지는 직접 따져볼수 있다.
public class ex32 {
    //A 65 a 97 z보다 ascii 값이 크면 더한 값에서 -26
    public String solution(String s, int n) {
        String answer = "";
        
        char[] sArr = s.toCharArray();
        for(int i=0; i<sArr.length; i++){
            if(sArr[i] == ' '){
                answer += sArr[i];
                continue;
            }
            if(sArr[i]>= 'a' && sArr[i]<='z'){
                if(sArr[i]+n >'z'){
                    answer += (char)(sArr[i]+n-26);
                }else{
                    answer += (char)(sArr[i]+n);
                }
            }else if(sArr[i]>='A' && sArr[i] <= 'Z'){
                if(sArr[i]+n >'Z'){
                    answer += (char)(sArr[i]+n-26);
                }else{
                    answer += (char)(sArr[i]+n);
                }
            }
        }
        
        return answer;
    }
}


//다른 풀이
//char 타입의 대소문자 판별기능이 있다. 
//Character.isLowerCase(), .isUpperCase()
class Caesar {
    String caesar(String s, int n) {
        String result = "";
    n = n % 26;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isLowerCase(ch)) {
        ch = (char) ((ch - 'a' + n) % 26 + 'a');
      } else if (Character.isUpperCase(ch)) {
        ch = (char) ((ch - 'A' + n) % 26 + 'A');
      }
      result += ch;
    }
        return result;
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
    }
}