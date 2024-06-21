//카드 뭉치

//cards1_idx ++ 했을때 cards1의 범위가 끝났는지 확인하려고 g.equals(cards1[cards1_idx]) && cards1_idx < cards1.length 를 if문화 하면
//index오류가 발생한다, 하지만 아래 코드와같이 역순으로 배치하면 발생하지않는다, 나는 같은의미로 동작할것이라 생각했지만,
//우선 범위를 초과하는지 판별을 하고 아니라면 아무리 뒤에 &&가 있더라도 후순위의 조건은 판별하지 않고 나와버리기 때문이다.
public class ex41 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int cards1_idx = 0;
        int cards2_idx = 0;
        for(String g : goal){
            if(cards1_idx < cards1.length && g.equals(cards1[cards1_idx])){
                cards1_idx++;
            }else if(cards2_idx < cards2.length && g.equals(cards2[cards2_idx])){
                cards2_idx++;
            }else{
                return "No";
            }
        }
        
        return "Yes";
    }
}
