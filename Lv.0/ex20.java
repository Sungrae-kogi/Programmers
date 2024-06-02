//n 번째 원소까지
//Java에서 배열 복사는 Arrays.copyOfRange를 사용하는 방법이 직관적이나 최근에 Stream api를 사용한 배열 슬라이스방법도 존재한다.

import java.util.Arrays;

public class ex20 {

    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list, 0, n);

        return answer;
    }

}
