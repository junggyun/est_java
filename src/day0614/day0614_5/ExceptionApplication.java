package day0614.day0614_5;

import java.util.Scanner;

public class ExceptionApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(divide1(a, b)); // 언체크드 예외
        } catch (UncheckedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(divide2(a, b)); // 체크드 예외
        } catch (CheckedException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close(); // 예외 발생 여부와 관계없이 실행
        }
    }

    public static double divide1(int a, int b) {
        if (b == 0) throw new UncheckedException("0으로 나눌 수 없습니다.");
        return (double) a / b;
    }

    public static double divide2(int a, int b) throws CheckedException {
        if (b == 0) throw new CheckedException("0으로 나눌 수 없습니다.");
        return (double) a / b;
    }
}
