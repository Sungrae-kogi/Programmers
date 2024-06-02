public class ex23 {
    public int solution(String binomial) {
        int answer=0;
        String[] mat = binomial.split(" ");
        switch(mat[1]){
            case "+":
                return Integer.parseInt(mat[0])+Integer.parseInt(mat[2]);
            case "-":
                return Integer.parseInt(mat[0])-Integer.parseInt(mat[2]);
            case "*":
                return Integer.parseInt(mat[0])*Integer.parseInt(mat[2]);
        }
        return answer;
    }
}
