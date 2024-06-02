//가까운 1 찾기
//index가 idx보다 큰 경우를 따지므로 반복 시작지점을 idx로 설정
public class ex21 {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = idx; i<arr.length; i++){
            if(arr[i] == 1)
                return i;
        }
        
        return -1;
    }
}
