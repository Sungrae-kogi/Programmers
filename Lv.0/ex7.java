public class ex7 {
    public int solution_my(double flo){
        return (int) flo;
    }


    //Math.floor(flo)는 소숫점 아래를 버릴뿐, 정수로 변환하는것이 아니다 ex) flo = 4.12 -> Math.floor(flo) = 4.0
    public int solution(double flo) {
        return (int)Math.floor(flo);
    }
}
