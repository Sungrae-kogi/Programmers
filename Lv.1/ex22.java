//행렬의 덧셈


public class ex22 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    //다른풀이, 어차피 배열의 크기가 같고 둘을 더한 결과를 반환하는것이므로 answer에 arr1을 할당해서 거기에 arr2를 더하게 할 수 있다.
    public int[][] solution2(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}
