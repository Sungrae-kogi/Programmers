public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int cards1_idx=0;
        int cards2_idx=0;
        for(int i=0; i<goal.length; i++){
            if(cards1_idx < cards1.length && goal[i].equals(cards1[cards1_idx])){
                cards1_idx++;
                continue;
            }else if(cards2_idx < cards2.length && goal[i].equals(cards2[cards2_idx])){
                cards2_idx++;
                continue;
            }else{
                return "No";
            }
            
        }
        return "Yes";
    }
}
