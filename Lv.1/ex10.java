//없는 숫자 더하기

//배열에 특정 값이 존재하는지 여부를 체크하는방법을 찾았으나 떠오르지않아, 2중 for문으로 탐색, 범위가 좁게 정해져있기때문에
//이렇게 사용해도 문제없다는것을 알았음.
public class ex10 {
    public int solution(int[] numbers) {
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        int answer = 0;
        int sum = 45;
        for(int i=0; i<=9; i++){
            for(int j=0; j<numbers.length; j++){
                if(numbers[j] == i)
                    answer +=i;
            }
        }
        
        return sum-answer;
    }
}

//타인의 풀이, 내가 생각한 방법과 유사하지만 for문 하나로 깔끔하게 정리한 느낌, 등장하지 않은 수의 합을 구하는것이므로
//1~9의 합에서 numbers의 수를 빼기만 하면 되는거였다.
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}