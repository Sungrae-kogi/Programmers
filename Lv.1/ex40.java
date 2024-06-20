//추억 점수

//배열 다루기, 특히나 배열에서 찾고자 하는 요소의 index 값을 구하는방식에 대하여 조사할 필요가있었다.
//제공하는 내부함수 없이 ind
public class ex40 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                //해당하는 문자열을 문자열배열에서 찾아 그 index값을 얻어내야 한다.
                int idx = indexOf(name,photo[i][j]);
                if(idx != -1){
                    sum += yearning[idx];
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
    
    public int indexOf(String[] arr, String str){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(str))
                return i;
        }
        return -1;
    }
}
