import java.util.ArrayList;
import java.util.List;

public class 개인정보수집유효기간 {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<privacies.length; i++){
            // 수집된 개인정보 정보를 추출.
            int year = Integer.parseInt(privacies[i].substring(0,4));
            int month = Integer.parseInt(privacies[i].substring(5,7));
            
            // 중요한 부분, 보관 기간은 계산한 후에 day-1일이 되는데 이때 기존 날짜가 1일이라면 0일이 되어버림.
            // 이에 대한 처리가 필요.
            int day = Integer.parseInt(privacies[i].substring(8,10))-1;
            char type = privacies[i].charAt(privacies[i].length()-1);
            
            // 맞는 약관을 기준으로 날짜 계산을 진행.
            for(int j=0; j<terms.length; j++){
                if(terms[j].charAt(0) == type){
                    //월 값을 더하고 바로 for를 종료.
                    month += Integer.parseInt(terms[j].substring(2));
                    break;
                }
            }
            
            if(month > 12){
                month -= 12;
                year++;
            }
            if(day < 1){
                //기존 날짜가 1일이었다면 만료 날짜 계산 뒤 일이 0이 되었으므로.
                if(month == 1){
                    year -= 1;
                    month = 12;
                    day = 28;
                }else{
                    month -=1;
                    day = 28;
                }
            }
            //today와 계산한 날짜비교
            int total = year*12*28 + month*28 + day;
            
            int total_today = Integer.parseInt(today.substring(0,4))*12*28 +
                Integer.parseInt(today.substring(5,7))*28 +
                Integer.parseInt(today.substring(8,10));
            //만료날짜보다 오늘이 더 크면 폐기
            if(total < total_today){
                answer.add(i+1);
            }
            continue;
            
            // 연도를 비교해서 만료처리.
            // 연도가 같다면 월을 비교하고, 연도와 월이 같다면 일을 비교해야한다.
            
            
        }
        
        return answer;
    }
}
