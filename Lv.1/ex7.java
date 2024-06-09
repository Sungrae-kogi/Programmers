//하샤드 수

//
public class ex7 {
    public boolean solution(int x) {
        int num = x;
        
        int sum = 0;
        while(x != 0){
            sum += x%10;
            x = x/10;
        }
        return num%sum==0? true: false;
    }
}
