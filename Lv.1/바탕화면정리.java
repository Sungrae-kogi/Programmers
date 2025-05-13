public class 바탕화면정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        //가장 작은 x좌표와 y좌표, 가장 큰 x좌표와 y좌표
        // *문제에서 주어진 범위가 0~50 이라고한다면 -1, 51로 잡아도 된다, 그리고 Integer.MAX_VALUE, Integer.MIN_VALUE 를 지원함.
        int min_x = wallpaper.length;
        int max_x = 0;
        int min_y = wallpaper[0].length();
        int max_y = 0;
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                // 파일을 찾을때마다 시작점, 끝점의 좌표를 비교갱신
                if(wallpaper[i].charAt(j) == '#'){
                    min_x = Math.min(min_x,i);
                    max_x = Math.max(max_x,i+1);
                    min_y = Math.min(min_y,j);
                    max_y = Math.max(max_y,j+1);
                }
            }
        }   
        answer[0] = min_x;
        answer[1] = min_y;
        answer[2] = max_x;
        answer[3] = max_y;
        
        return answer;
    }
}
