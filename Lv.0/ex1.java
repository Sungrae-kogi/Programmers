//조건에 맞게 수열 변환하기3
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        if(k%2==1){
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i]*k;
            }
        }else{
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i]+k;
            }
        }
        
        return answer;
    }
}
