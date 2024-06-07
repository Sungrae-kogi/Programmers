import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(str);
        }
        System.out.println(answer.toString());
    }

    // repeat() 함수로 문자열 반복이 가능
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));
    }

}