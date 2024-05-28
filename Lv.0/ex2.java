//접미사인지 확인하기
class Solution {
    public int solution(String my_string, String is_suffix) {
        
        for(int i=my_string.length(); i>=0; i--){
            if(is_suffix.equals(my_string.substring(i,my_string.length())))
                return 1;
        }
        
        return 0;
    }
}
