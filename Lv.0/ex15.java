public class ex15 {
    class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;
            //myString = myString.toUpperCase();
            //pat = pat.toUpperCase();
            return myString.toUpperCase().contains(pat.toUpperCase())? 1: 0;
        }
    }
}
//contains 함수
