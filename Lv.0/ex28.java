//덧셈식 출력하기
import java.util.Scanner;

//printf 함수로 문자열 포매팅으로 원하는 형식으로 출력이 가능.
public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}
