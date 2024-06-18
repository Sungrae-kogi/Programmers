//최소직사각형

//모든거를 담을 수 있는 직사각형의 최소 넓이, 어차피 회전시켜서 담아야 한다면, 모든 직사각형을 가로가 세로보다 길게 또는 반대로
//한가지의 경우로 일치시키는 작업을 한 뒤 가로 세로의 최대값을 구하면 그것이 최소넓이일것이다.
public class ex31 {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int[] size : sizes){
            if(size[0] < size[1]){
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
               
        }
        int max_one = 0;
        int max_two = 0;
        for(int i=0; i<sizes.length; i++){
            max_one = Math.max(sizes[i][0],max_one);
            max_two = Math.max(sizes[i][1],max_two);
        }
        
        return max_one*max_two;
    }
}
