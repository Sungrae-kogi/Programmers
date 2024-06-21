//2016년

import java.time.DayOfWeek;
import java.time.LocalDate;

//직접푼거는 아니다.
//Java에서의 날짜 라이브러리에 대해 알필요가있는 문제이기때문에 검색을 해봤고 요일을 다루는데 필요한 함수들을 찾아냈다.
public class ex43 {
    public String solution(int a, int b) {
        String[] weekStr = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        
        //of() 메소드는 전달된 인수를 가지고 특정 날짜와 시간을 표현하는 새로운 객체를 생성하여 반환합니다.
        //현재의 날짜를 자동으로 가져오려면 .now() 입력한 특정 날짜를 사용하려면 .of()
        LocalDate date = LocalDate.of(2016,a,b);
        DayOfWeek dow = date.getDayOfWeek();
        
        //DayOfWeek의 getValue()는 월요일=1, 일요일=7의 값을 리턴.
        int daynum = dow.getValue();
        return weekStr[daynum-1];
    }
}


//라이브러리를 사용하지 않은 방법이 다른풀이들 중에서 인정받는분위기인거같아 가져온 코드
//1월 1일은 금요일이다 라는 조건이 정해져있는것도 중요.
class TryHelloWorld
{
    public String getDayName(int a, int b) {
        String answer = "";
        //1월 1일은 금요일 따라서 요일 배열 idx =0 에 FRI를 놓고, allDate 변수를 1일 금요일의 idx 인 0으로 설정.
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        //4월까지의 모든 일 수를 누적합 해주고 5월의 해당 일수까지 더해준다
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}